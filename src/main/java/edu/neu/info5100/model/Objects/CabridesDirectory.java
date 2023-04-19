package edu.neu.info5100.model.Objects;

import java.util.ArrayList;

public class CabridesDirectory {
    ArrayList<Cabride> Cabrides = new ArrayList<Cabride>();

    public CabridesDirectory(ArrayList<Cabride> cabrides) {
        Cabrides = cabrides;
    }

    public ArrayList<Cabride> getCabrides() {
        return Cabrides;
    }

    public void setCabrides(ArrayList<Cabride> cabrides) {
        Cabrides = cabrides;
    }

    public boolean add(Cabride cabride) {
        return Cabrides.add(cabride);
    }
}
