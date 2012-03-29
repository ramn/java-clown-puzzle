public class Solution {

  static class DeviantClown extends Clown {
    private Volkswagen vw;
    private int addCount;

    public DeviantClown(Volkswagen vw, int addCount) {
      this.vw = vw;
      this.addCount = addCount;
    }

    public int hashCode() {
      if (this.addCount < 20) {
        this.vw.add(new DeviantClown(vw, addCount + 1));
      }
      return super.hashCode();
    }
  }

  public static void main(String args[]) {
    Volkswagen vw = new Volkswagen();
    vw.add(new DeviantClown(vw, 1));
    vw.done();
  }
}
