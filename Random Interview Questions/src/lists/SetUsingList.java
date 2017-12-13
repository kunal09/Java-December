package lists;

import java.util.LinkedList;
import java.util.List;

public class SetUsingList {

    private List<Integer> m_list = new LinkedList<Integer>();

    private int getPosition(Integer input)
    {
        for (int i = 0; i < m_list.size(); i++)
        {
            if (m_list.get(i) == input) {
                return i;
            }
        }
        return -1;
    }


    public boolean contains(Integer input) {
        return getPosition(input) >=0;
    }

    //adding an element to the set input
     public boolean add(Integer element) {
        if (contains(element))
            return false;

        // add the element
         m_list.add(element);
         return true;
    }

    //removing element from set
    public boolean remove(Integer element) {
        if (!contains(element))
            return false;

        int position = getPosition(element);
        m_list.remove(position);
        return true;
    }

    //printing the set
     @Override public String toString() {

        String output = "";

        for(int i=0;i<m_list.size();i++)
        {
            output += "," + m_list.get(i);
        }

        return output;
    }

}
