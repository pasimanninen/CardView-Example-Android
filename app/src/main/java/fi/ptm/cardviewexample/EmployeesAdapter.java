package fi.ptm.cardviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by pasi on 20/10/16.
 */

public class EmployeesAdapter extends RecyclerView.Adapter<EmployeesAdapter.ViewHolder> {
    // adapter data
    private List<Employee> employeeList;

    // adapter constructor, get data from activity
    public EmployeesAdapter(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    // return the size of employeeList (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    // create a view for this card
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_card, parent, false);
        return new ViewHolder(view);
    }

    // replace the contents of a view (invoked by the layout manager)
    // - get element from employeelist at this position
    // - replace the contents of the view with that element
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        Employee employee = employeeList.get(position);
        viewHolder.employeeImageView.setImageResource(employee.photoId);
        viewHolder.employeeNameTextView.setText(employee.name);
        viewHolder.employeePositionTextView.setText(employee.position);
        viewHolder.employeeEmailTextView.setText(employee.email);
        viewHolder.employeePhoneTextView.setText(employee.phone);
    }

    // view holder class to specify card UI objects
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView employeeImageView;
        public TextView employeeNameTextView;
        public TextView employeePositionTextView;
        public TextView employeeEmailTextView;
        public TextView employeePhoneTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            // get layout ids
            employeeImageView = (ImageView) itemView.findViewById(R.id.employeeImageView);
            employeeNameTextView = (TextView) itemView.findViewById(R.id.employeeNameTextView);
            employeePositionTextView = (TextView) itemView.findViewById(R.id.employeePositionTextView);
            employeeEmailTextView = (TextView) itemView.findViewById(R.id.employeeEmailTextView);
            employeePhoneTextView = (TextView) itemView.findViewById(R.id.employeePhoneTextView);
            // add click listner for a card
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    String name = employeeList.get(position).name;
                    Toast.makeText(view.getContext(), name, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}