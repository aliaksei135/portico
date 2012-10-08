/*
 *   Copyright 2006 The Portico Project
 *
 *   This file is part of portico.
 *
 *   portico is free software; you can redistribute it and/or modify
 *   it under the terms of the Common Developer and Distribution License (CDDL) 
 *   as published by Sun Microsystems. For more information see the LICENSE file.
 *   
 *   Use of this software is strictly AT YOUR OWN RISK!!!
 *   If something bad happens you do not have permission to come crying to me.
 *   (that goes for your lawyer as well)
 *
 */
package org.portico.lrc.model;

import java.io.Serializable;

/**
 * This class contains metadata for a FOM parameter class 
 */
public class PCMetadata implements Serializable
{
	//----------------------------------------------------------
	//                    STATIC VARIABLES
	//----------------------------------------------------------
	private static final long serialVersionUID = 98121116105109L;

	//----------------------------------------------------------
	//                   INSTANCE VARIABLES
	//----------------------------------------------------------
	private String     name;
	private int        handle;
	private ICMetadata container;
	
	//----------------------------------------------------------
	//                      CONSTRUCTORS
	//----------------------------------------------------------
	/**
	 * <b>NOTE:</b> This constructor should generally not be used. If you want an instance of this
	 * class you should use the creation methods of {@link ObjectModel ObjectModel}.
	 */
	public PCMetadata( String name, int handle )
	{
		this.name      = name;
		this.handle    = handle;
		this.container = null;
	}
	
	//----------------------------------------------------------
	//                    INSTANCE METHODS
	//----------------------------------------------------------

	public String getName()
	{
		return this.name;
	}
	
	public int getHandle()
	{
		return this.handle;
	}

	/**
	 * Changes the handle of this class. To prevent external tampering, this
	 * is marked as protected and should not be called by anything except the
	 * model merger.
	 */
	protected void setHandle( int handle )
	{
		this.handle = handle;
	}

	public ICMetadata getContainer()
	{
		return this.container;
	}
	
	public void setContainer( ICMetadata container )
	{
		this.container = container;
	}

	/**
	 * @return true if the other object is another {@link PCMetadata} and has the same name.
	 *         False otherwise.
	 */
	public boolean equals( Object other )
	{
		if( other instanceof PCMetadata )
		{
			PCMetadata otherMetadata = (PCMetadata)other;
			if( name.equals(otherMetadata.name) )
			{
				return true;
			}
		}

		return false;
	}

	//----------------------------------------------------------
	//                     STATIC METHODS
	//----------------------------------------------------------
	
}
