package by.siarhei.solution.tag;

public abstract class Tag {
    private String name;

    Tag(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
