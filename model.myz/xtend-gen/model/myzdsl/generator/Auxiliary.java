package model.myzdsl.generator;

import java.util.List;
import model.myzdsl.myZDsl.MyZModel;
import model.myzdsl.myZDsl.Schema;
import model.myzdsl.myZDsl.SystemStateSpace;

@SuppressWarnings("all")
public class Auxiliary {
  /**
   * def static List<SystemStateSpace> getSystemStateSpace(MyZModel root) {
   * var List<Action> actionlist = new ArrayList<Action>()
   * for (Task t : root.tasks){
   * actionlist.add(t.action)
   * }
   * return actionlist;
   * }
   */
  public static List<Schema> getSchemas(final MyZModel zmodel) {
    return zmodel.getSchemas();
  }
  
  public static List<SystemStateSpace> getSystemStateSpace(final MyZModel zmodel) {
    return zmodel.getSystemstatespace();
  }
}
