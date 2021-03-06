/**
 * Copyright (c) 2011-2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getRealizesGoals <em>Realizes Goals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getDecomposesObjective <em>Decomposes Objective</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getIsSupportedByBusinessService <em>Is Supported By Business Service</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getIsDecomposedByObjectives <em>Is Decomposed By Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectiveImpl extends ElementImpl implements Objective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Goal> getRealizesGoals() {
		return (EList<Goal>)eDynamicGet(ContentfwkPackage.OBJECTIVE__REALIZES_GOALS, ContentfwkPackage.Literals.OBJECTIVE__REALIZES_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Measure> getIsTrackedAgainstMeasures() {
		return (EList<Measure>)eDynamicGet(ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES, ContentfwkPackage.Literals.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective getDecomposesObjective() {
		return (Objective)eDynamicGet(ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE, ContentfwkPackage.Literals.OBJECTIVE__DECOMPOSES_OBJECTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective basicGetDecomposesObjective() {
		return (Objective)eDynamicGet(ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE, ContentfwkPackage.Literals.OBJECTIVE__DECOMPOSES_OBJECTIVE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposesObjective(Objective newDecomposesObjective, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDecomposesObjective, ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesObjective(Objective newDecomposesObjective) {
		eDynamicSet(ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE, ContentfwkPackage.Literals.OBJECTIVE__DECOMPOSES_OBJECTIVE, newDecomposesObjective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BusinessService> getIsSupportedByBusinessService() {
		return (EList<BusinessService>)eDynamicGet(ContentfwkPackage.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE, ContentfwkPackage.Literals.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Objective> getIsDecomposedByObjectives() {
		return (EList<Objective>)eDynamicGet(ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES, ContentfwkPackage.Literals.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizesGoals()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTrackedAgainstMeasures()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				Objective decomposesObjective = basicGetDecomposesObjective();
				if (decomposesObjective != null)
					msgs = ((InternalEObject)decomposesObjective).eInverseRemove(this, ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES, Objective.class, msgs);
				return basicSetDecomposesObjective((Objective)otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSupportedByBusinessService()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedByObjectives()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return ((InternalEList<?>)getRealizesGoals()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<?>)getIsTrackedAgainstMeasures()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				return basicSetDecomposesObjective(null, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE:
				return ((InternalEList<?>)getIsSupportedByBusinessService()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES:
				return ((InternalEList<?>)getIsDecomposedByObjectives()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return getRealizesGoals();
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return getIsTrackedAgainstMeasures();
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				if (resolve) return getDecomposesObjective();
				return basicGetDecomposesObjective();
			case ContentfwkPackage.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE:
				return getIsSupportedByBusinessService();
			case ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES:
				return getIsDecomposedByObjectives();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				getRealizesGoals().clear();
				getRealizesGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				getIsTrackedAgainstMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				setDecomposesObjective((Objective)newValue);
				return;
			case ContentfwkPackage.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE:
				getIsSupportedByBusinessService().clear();
				getIsSupportedByBusinessService().addAll((Collection<? extends BusinessService>)newValue);
				return;
			case ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES:
				getIsDecomposedByObjectives().clear();
				getIsDecomposedByObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				getRealizesGoals().clear();
				return;
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				return;
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				setDecomposesObjective((Objective)null);
				return;
			case ContentfwkPackage.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE:
				getIsSupportedByBusinessService().clear();
				return;
			case ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES:
				getIsDecomposedByObjectives().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return !getRealizesGoals().isEmpty();
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return !getIsTrackedAgainstMeasures().isEmpty();
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				return basicGetDecomposesObjective() != null;
			case ContentfwkPackage.OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE:
				return !getIsSupportedByBusinessService().isEmpty();
			case ContentfwkPackage.OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES:
				return !getIsDecomposedByObjectives().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectiveImpl
