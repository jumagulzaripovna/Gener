public class Box <P> {
    P pole;

    public Box(P pole) {
        this.pole = pole;

    }

    public P getPole() {
        return pole;
    }

    public void setPole(P pole) {
        this.pole = pole;

    }

    public <R> void met(String moscow) {
        return;
    }

    public <S> S methed(S mani) {
        return mani;
    }

    @Override
    public String toString() {
        return "Box{" +
                "pole=" + pole +
                '}';
    }


    public <C> C method1(C meth) {

        return meth;

    }
}
