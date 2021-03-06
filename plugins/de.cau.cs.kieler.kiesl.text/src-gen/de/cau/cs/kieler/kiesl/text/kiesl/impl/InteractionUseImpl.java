/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kiesl.text.kiesl.impl;

import de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse;
import de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage;
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionUseImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionUseImpl#getLifelines <em>Lifelines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionUseImpl extends ElementImpl implements InteractionUse
{
  /**
   * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected static final String CAPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected String caption = CAPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifelines()
   * @generated
   * @ordered
   */
  protected EList<Lifeline> lifelines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionUseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KieslPackage.Literals.INTERACTION_USE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCaption()
  {
    return caption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaption(String newCaption)
  {
    String oldCaption = caption;
    caption = newCaption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.INTERACTION_USE__CAPTION, oldCaption, caption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Lifeline> getLifelines()
  {
    if (lifelines == null)
    {
      lifelines = new EObjectResolvingEList<Lifeline>(Lifeline.class, this, KieslPackage.INTERACTION_USE__LIFELINES);
    }
    return lifelines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KieslPackage.INTERACTION_USE__CAPTION:
        return getCaption();
      case KieslPackage.INTERACTION_USE__LIFELINES:
        return getLifelines();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KieslPackage.INTERACTION_USE__CAPTION:
        setCaption((String)newValue);
        return;
      case KieslPackage.INTERACTION_USE__LIFELINES:
        getLifelines().clear();
        getLifelines().addAll((Collection<? extends Lifeline>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KieslPackage.INTERACTION_USE__CAPTION:
        setCaption(CAPTION_EDEFAULT);
        return;
      case KieslPackage.INTERACTION_USE__LIFELINES:
        getLifelines().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KieslPackage.INTERACTION_USE__CAPTION:
        return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
      case KieslPackage.INTERACTION_USE__LIFELINES:
        return lifelines != null && !lifelines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (caption: ");
    result.append(caption);
    result.append(')');
    return result.toString();
  }

} //InteractionUseImpl
