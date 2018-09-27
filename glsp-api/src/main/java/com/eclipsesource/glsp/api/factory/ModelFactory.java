/*******************************************************************************
 * Copyright (c) 2018 EclipseSource Services GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 * 	Tobias Ortmayr - initial API and implementation
 ******************************************************************************/
package com.eclipsesource.glsp.api.factory;

import com.eclipsesource.glsp.api.action.kind.RequestModelAction;

import io.typefox.sprotty.api.SModelRoot;

public interface ModelFactory {

	SModelRoot loadModel(RequestModelAction action);

	public static class NullImpl implements ModelFactory {

		@Override
		public SModelRoot loadModel(RequestModelAction action) {
			return null;
		}

	}

}
