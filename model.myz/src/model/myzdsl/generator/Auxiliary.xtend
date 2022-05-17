package model.myzdsl.generator

import java.util.ArrayList
import java.util.List
import model.myzdsl.myZDsl.MyZModel
import model.myzdsl.myZDsl.Schema
import model.myzdsl.myZDsl.SystemStateSpace


class Auxiliary {
	/*
	def static List<SystemStateSpace> getSystemStateSpace(MyZModel root) {
 var List<Action> actionlist = new ArrayList<Action>()
 for (Task t : root.tasks){
 actionlist.add(t.action)
 }
 return actionlist;
 }*/
 
 def static List<Schema> getSchemas(MyZModel zmodel) {
 return zmodel.schemas;
 }
 
  def static List<SystemStateSpace> getSystemStateSpace(MyZModel zmodel) {
  return zmodel.systemstatespace;
  }
}