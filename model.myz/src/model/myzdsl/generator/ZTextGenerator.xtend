package model.myzdsl.generator

import model.myzdsl.myZDsl.MyZModel

class ZTextGenerator {
	
def static toText(MyZModel zmodel)'''
«"\n"»
 «FOR p : zmodel.systemstatespace»
«"_____"»«p.name»«"_________________\n"»
 	 «FOR q : p.variables»
       «q.name»«"\n"»
     «ENDFOR»
«"_________________________________"»
	«FOR r : p.predicate»
	  	  «FOR s : r.vas»
	        «s.name» = «r.function» «r.predicateVar.name»«"\n"»
	      «ENDFOR»
«"_________________________________"»
  «ENDFOR»
 «ENDFOR»

*

«FOR p : zmodel.initialstate»
«"_____"»«p.name»«"____________\n"»
 	 «FOR q : p.variables»
       «q.name»«"\n"»
     «ENDFOR»
«"_________________________________"»
	«FOR r : p.pred»
        «r.name» = EMPTY «"\n"»
«"_________________________________"»
  «ENDFOR»
 «ENDFOR»

*

«FOR p : zmodel.schemas»
«"_____"»«p.name»«"_________________\n"»
«p.state» in «p.nameSchema»«"\n"»
 	 «FOR q : p.varsInput»
       «q.name»? : «q.name.toUpperCase()»«"\n"»
     «ENDFOR»
     «FOR q : p.varsOutput»
«q.name»! : «q.name.toUpperCase()»«"\n"»
          «ENDFOR»
«"_________________________________"»
«FOR r : p.predicates»
   	  «FOR s : r.vasInput»
         «s.name»? «r.belongs» «r.belongsVariable.name»«"\n"»
       «ENDFOR»
       «FOR s : r.vasOutput»
      «s.condition21.name»! = «s.condition23.name» («s.condition22.name»?)«"\n"»
        «ENDFOR»
        «FOR s : r.vasStateChange»
       «s.condition11.name»'= «s.condition11.name» U {«s.condition12.name»? ->«s.condition13.name»?}«"\n"»
              «ENDFOR»
 «"_________________________________"»
 «ENDFOR»

*

  «ENDFOR»

'''
	
	
	
}