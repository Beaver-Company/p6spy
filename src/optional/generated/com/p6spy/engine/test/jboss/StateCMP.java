/*
 * Generated by XDoclet - Do not edit!
 */
package com.p6spy.engine.test.jboss;

/**
 * CMP layer for State.
 */
public abstract class StateCMP
   extends com.p6spy.engine.test.jboss.StateBean
   implements javax.ejb.EntityBean
{

   public void ejbLoad() 
   {
      super.ejbLoad();
   }

   public void ejbStore() 
   {
         super.ejbStore();
   }

   public void ejbActivate() 
   {
      super.ejbActivate();
   }

   public void ejbPassivate() 
   {
      super.ejbPassivate();

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
      super.setEntityContext(ctx);
   }

   public void unsetEntityContext() 
   {
      super.unsetEntityContext();
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

   public abstract java.lang.String getCountryId() ;

   public abstract void setCountryId( java.lang.String countryId ) ;

   public abstract java.lang.String getStateId() ;

   public abstract void setStateId( java.lang.String stateId ) ;

   public abstract java.lang.String getName() ;

   public abstract void setName( java.lang.String name ) ;

}
