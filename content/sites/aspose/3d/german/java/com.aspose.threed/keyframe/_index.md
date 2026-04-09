---
title: KeyFrame
second_title: Aspose.3D für Java API-Referenz
description: Ein Schlüsselbild wird hauptsächlich durch eine Zeit und einen Wert definiert; für einige Interpolationstypen werden Tangente/Spannung/Bias/Kontinuität ebenfalls bei der Berechnung des endgültigen abgetasteten Wertes verwendet.
type: docs
weight: 89
url: /de/java/com.aspose.threed/keyframe/
---

**Inheritance:**
java.lang.Object
```
public class KeyFrame
```

Ein Schlüsselbild wird hauptsächlich durch eine Zeit und einen Wert definiert; für einige Interpolationstypen werden Tangente/Spannung/Bias/Kontinuität ebenfalls bei der Berechnung des endgültigen abgetasteten Wertes verwendet. Abgetastete Werte an einer Zeitposition, die kein Schlüsselbild ist, werden durch Schlüsselbilder zwischen dem vorherigen und dem nächsten Schlüsselbild interpoliert. Der Wert vor/nach dem ersten/letzten Schlüsselbild wird von der [Extrapolation](../../com.aspose.threed/extrapolation) Klasse berechnet.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [KeyFrame(KeyframeSequence curve, double time)](#KeyFrame-com.aspose.threed.KeyframeSequence-double-) | Erstelle ein neues Schlüsselbild auf der angegebenen Kurve |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBias()](#getBias--) | Gibt den Bias zurück, der im TCB‑Spline verwendet wird |
| [getClass()](#getClass--) |  |
| [getContinuity()](#getContinuity--) | Gibt die Kontinuität zurück, die im TCB‑Spline verwendet wird |
| [getFlat()](#getFlat--) | Lese oder setze, ob das Schlüsselbild flach ist. |
| [getIndependentTangent()](#getIndependentTangent--) | Gibt zurück, dass die Out‑ und Next‑In‑Tangenten unabhängig sind. |
| [getInterpolation()](#getInterpolation--) | Gibt den Interpolationstyp des Schlüssels zurück; list.data[index] definiert den Algorithmus, wie der abgetastete Wert berechnet wird. |
| [getNextInTangent()](#getNextInTangent--) | Gibt die nächste Eingangs‑(linke) Tangente dieses Schlüsselbildes zurück. |
| [getNextInWeight()](#getNextInWeight--) | Gibt das nächste Eingangs‑(linke) Gewicht dieses Schlüsselbildes zurück. |
| [getOutTangent()](#getOutTangent--) | Gibt die Ausgangs‑(rechte) Tangente dieses Schlüsselbildes zurück. |
| [getOutWeight()](#getOutWeight--) | Gibt das Ausgangs‑(rechte) Gewicht dieses Schlüsselbildes zurück. |
| [getStepMode()](#getStepMode--) | Gibt den Schrittmodus des Schlüssels zurück. |
| [getTangentWeightMode()](#getTangentWeightMode--) | Gibt den Tangenten‑Gewicht‑Modus des Schlüssels zurück. |
| [getTension()](#getTension--) | Gibt die Spannung zurück, die im TCB‑Spline verwendet wird. |
| [getTime()](#getTime--) | Gibt die Zeitposition des list.data[index] Schlüsselbildes zurück, gemessen in Sekunden. |
| [getTimeIndependentTangent()](#getTimeIndependentTangent--) | Gibt zurück, dass die Tangente zeitunabhängig ist. |
| [getValue()](#getValue--) | Gibt den Wert des Schlüsselbildes zurück. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBias(float value)](#setBias-float-) | Setzt den Bias, der im TCB‑Spline verwendet wird. |
| [setContinuity(float value)](#setContinuity-float-) | Setzt die Kontinuität, die im TCB‑Spline verwendet wird. |
| [setFlat(boolean value)](#setFlat-boolean-) | Lese oder setze, ob das Schlüsselbild flach ist. |
| [setIndependentTangent(boolean value)](#setIndependentTangent-boolean-) | Setzt, dass die Ausgangs‑ und nächsten Eingangs‑Tangenten unabhängig sind. |
| [setInterpolation(Interpolation value)](#setInterpolation-com.aspose.threed.Interpolation-) | Legt den Interpolationstyp des Schlüssels fest, list.data[index] definiert den Algorithmus, wie der abgetastete Wert berechnet wird. |
| [setNextInTangent(Vector2 value)](#setNextInTangent-com.aspose.threed.Vector2-) | Setzt die nächste Eingangs‑(linke) Tangente dieses Schlüsselbilds. |
| [setNextInWeight(float value)](#setNextInWeight-float-) | Setzt das nächste Eingangs‑(linke) Gewicht dieses Schlüsselbilds. |
| [setOutTangent(Vector2 value)](#setOutTangent-com.aspose.threed.Vector2-) | Setzt die Ausgangs‑(rechte) Tangente dieses Schlüsselbilds. |
| [setOutWeight(float value)](#setOutWeight-float-) | Setzt das Ausgangs‑(rechte) Gewicht dieses Schlüsselbilds. |
| [setStepMode(StepMode value)](#setStepMode-com.aspose.threed.StepMode-) | Legt den Schrittmodus des Schlüssels fest. |
| [setTangentWeightMode(int value)](#setTangentWeightMode-int-) | Legt den Tangenten‑Gewichtsmodus des Schlüssels fest. |
| [setTension(float value)](#setTension-float-) | Setzt die Spannung, die im TCB‑Spline verwendet wird. |
| [setTime(double value)](#setTime-double-) | Setzt die Zeitposition des Schlüsselbilds list.data[index], gemessen in Sekunden. |
| [setTimeIndependentTangent(boolean value)](#setTimeIndependentTangent-boolean-) | Setzt, dass die Tangente zeitunabhängig ist. |
| [setValue(float value)](#setValue-float-) | Setzt den Wert des Schlüsselbilds. |
| [toString()](#toString--) | Liefert die Zeichenkettenrepräsentation des Schlüsselbilds. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### KeyFrame(KeyframeSequence curve, double time) {#KeyFrame-com.aspose.threed.KeyframeSequence-double-}
```
public KeyFrame(KeyframeSequence curve, double time)
```


Erstelle ein neues Schlüsselbild auf der angegebenen Kurve

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| curve | [KeyframeSequence](../../com.aspose.threed/keyframesequence) | Die Kurve, auf der das Schlüsselbild erstellt wird. |
| Zeit | double | Die Zeitposition des Schlüsselbilds. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBias() {#getBias--}
```
public float getBias()
```


Gibt den Bias zurück, der im TCB‑Spline verwendet wird

**Returns:**
float – die Verzerrung, die im TCB‑Spline verwendet wird.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getContinuity() {#getContinuity--}
```
public float getContinuity()
```


Gibt die Kontinuität zurück, die im TCB‑Spline verwendet wird

**Returns:**
float – die Kontinuität, die im TCB‑Spline verwendet wird.
### getFlat() {#getFlat--}
```
public boolean getFlat()
```


Abrufen oder Festlegen, ob das Schlüsselbild flach ist. Das Schlüsselbild sollte flach sein, wenn das nächste oder vorherige Schlüsselbild denselben Wert hat. Ein flaches Schlüsselbild hat flache Tangenten und feste Interpolation.

**Returns:**
boolean – Abrufen oder Festlegen, ob das Schlüsselbild flach ist. Das Schlüsselbild sollte flach sein, wenn das nächste oder vorherige Schlüsselbild denselben Wert hat. Ein flaches Schlüsselbild hat flache Tangenten und feste Interpolation.
### getIndependentTangent() {#getIndependentTangent--}
```
public boolean getIndependentTangent()
```


Gibt zurück, dass die Out‑ und Next‑In‑Tangenten unabhängig sind.

**Returns:**
boolean – die Ausgangs‑ und nächsten Eingangs‑Tangenten sind unabhängig.
### getInterpolation() {#getInterpolation--}
```
public Interpolation getInterpolation()
```


Gibt den Interpolationstyp des Schlüssels zurück; list.data[index] definiert den Algorithmus, wie der abgetastete Wert berechnet wird.

**Returns:**
[Interpolation](../../com.aspose.threed/interpolation) - the key's interpolation type, list.data[index] defines the algorithm how the sampled value is calculated.
### getNextInTangent() {#getNextInTangent--}
```
public Vector2 getNextInTangent()
```


Gibt die nächste Eingangs‑(linke) Tangente dieses Schlüsselbildes zurück.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the next in(left) tangent on this key frame.
### getNextInWeight() {#getNextInWeight--}
```
public float getNextInWeight()
```


Gibt das nächste Eingangs‑(linke) Gewicht dieses Schlüsselbildes zurück.

**Returns:**
float – das nächste Eingangs‑(linke) Gewicht dieses Schlüsselbilds.
### getOutTangent() {#getOutTangent--}
```
public Vector2 getOutTangent()
```


Gibt die Ausgangs‑(rechte) Tangente dieses Schlüsselbildes zurück.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the out(right) tangent on this key frame.
### getOutWeight() {#getOutWeight--}
```
public float getOutWeight()
```


Gibt das Ausgangs‑(rechte) Gewicht dieses Schlüsselbildes zurück.

**Returns:**
float – das Ausgangs‑(rechte) Gewicht dieses Schlüsselbilds.
### getStepMode() {#getStepMode--}
```
public StepMode getStepMode()
```


Liefert den Schrittmodus des Schlüssels. Wenn der Interpolationstyp [Interpolation.CONSTANT](../../com.aspose.threed/interpolation\#CONSTANT) ist, entscheidet list.data[index], welcher Schlüsselbildwert während der Interpolation verwendet wird. Ein [StepMode.PREVIOUS\_VALUE](../../com.aspose.threed/stepmode\#PREVIOUS-VALUE) bedeutet, dass der Wert des linken Schlüsselbilds verwendet wird. Ein [StepMode.NEXT\_VALUE](../../com.aspose.threed/stepmode\#NEXT-VALUE) bedeutet, dass der Wert des nächsten rechten Schlüsselbilds verwendet wird.

**Returns:**
[StepMode](../../com.aspose.threed/stepmode) - the key's step mode. If the interpolation type is [Interpolation.CONSTANT](../../com.aspose.threed/interpolation\#CONSTANT), list.data[index] decides which key-frame's value will be used during interpolation. A [StepMode.PREVIOUS\_VALUE](../../com.aspose.threed/stepmode\#PREVIOUS-VALUE) means the left key-frame's value will be used A [StepMode.NEXT\_VALUE](../../com.aspose.threed/stepmode\#NEXT-VALUE) means the next right key-frame's value will be used
### getTangentWeightMode() {#getTangentWeightMode--}
```
public int getTangentWeightMode()
```


Liefert den Tangenten‑Gewichtsmodus des Schlüssels. Die Ausgangs‑Tangente oder die nächste Eingangs‑Tangente kann durch Auswahl des richtigen [WeightedMode](../../com.aspose.threed/weightedmode) angepasst werden.

**Returns:**
int – der Tangenten‑Gewichtsmodus des Schlüssels. Die Ausgangs‑Tangente oder die nächste Eingangs‑Tangente kann durch Auswahl des richtigen [WeightedMode](../../com.aspose.threed/weightedmode) angepasst werden.
### getTension() {#getTension--}
```
public float getTension()
```


Gibt die Spannung zurück, die im TCB‑Spline verwendet wird.

**Returns:**
float - Spannung, die im TCB-Spline verwendet wird
### getTime() {#getTime--}
```
public double getTime()
```


Gibt die Zeitposition des list.data[index] Schlüsselbildes zurück, gemessen in Sekunden.

**Returns:**
double - die Zeitposition des Schlüsselbilds list.data[index], gemessen in Sekunden.
### getTimeIndependentTangent() {#getTimeIndependentTangent--}
```
public boolean getTimeIndependentTangent()
```


Gibt zurück, dass die Tangente zeitunabhängig ist.

**Returns:**
boolean - die Tangente ist zeitunabhängig
### getValue() {#getValue--}
```
public float getValue()
```


Gibt den Wert des Schlüsselbildes zurück.

**Returns:**
float - der Wert des Schlüsselbilds.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setBias(float value) {#setBias-float-}
```
public void setBias(float value)
```


Setzt den Bias, der im TCB‑Spline verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setContinuity(float value) {#setContinuity-float-}
```
public void setContinuity(float value)
```


Setzt die Kontinuität, die im TCB‑Spline verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setFlat(boolean value) {#setFlat-boolean-}
```
public void setFlat(boolean value)
```


Abrufen oder Festlegen, ob das Schlüsselbild flach ist. Das Schlüsselbild sollte flach sein, wenn das nächste oder vorherige Schlüsselbild denselben Wert hat. Ein flaches Schlüsselbild hat flache Tangenten und feste Interpolation.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setIndependentTangent(boolean value) {#setIndependentTangent-boolean-}
```
public void setIndependentTangent(boolean value)
```


Setzt, dass die Ausgangs‑ und nächsten Eingangs‑Tangenten unabhängig sind.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setInterpolation(Interpolation value) {#setInterpolation-com.aspose.threed.Interpolation-}
```
public void setInterpolation(Interpolation value)
```


Legt den Interpolationstyp des Schlüssels fest, list.data[index] definiert den Algorithmus, wie der abgetastete Wert berechnet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Interpolation](../../com.aspose.threed/interpolation) | Neuer Wert |

### setNextInTangent(Vector2 value) {#setNextInTangent-com.aspose.threed.Vector2-}
```
public void setNextInTangent(Vector2 value)
```


Setzt die nächste Eingangs‑(linke) Tangente dieses Schlüsselbilds.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setNextInWeight(float value) {#setNextInWeight-float-}
```
public void setNextInWeight(float value)
```


Setzt das nächste Eingangs‑(linke) Gewicht dieses Schlüsselbilds.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setOutTangent(Vector2 value) {#setOutTangent-com.aspose.threed.Vector2-}
```
public void setOutTangent(Vector2 value)
```


Setzt die Ausgangs‑(rechte) Tangente dieses Schlüsselbilds.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

### setOutWeight(float value) {#setOutWeight-float-}
```
public void setOutWeight(float value)
```


Setzt das Ausgangs‑(rechte) Gewicht dieses Schlüsselbilds.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setStepMode(StepMode value) {#setStepMode-com.aspose.threed.StepMode-}
```
public void setStepMode(StepMode value)
```


Legt den Schrittmodus des Schlüssels fest. Wenn der Interpolationstyp [Interpolation.CONSTANT](../../com.aspose.threed/interpolation\#CONSTANT) ist, entscheidet list.data[index], welcher Schlüsselbildwert während der Interpolation verwendet wird. Ein [StepMode.PREVIOUS\_VALUE](../../com.aspose.threed/stepmode\#PREVIOUS-VALUE) bedeutet, dass der Wert des linken Schlüsselbilds verwendet wird. Ein [StepMode.NEXT\_VALUE](../../com.aspose.threed/stepmode\#NEXT-VALUE) bedeutet, dass der Wert des nächsten rechten Schlüsselbilds verwendet wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [StepMode](../../com.aspose.threed/stepmode) | Neuer Wert |

### setTangentWeightMode(int value) {#setTangentWeightMode-int-}
```
public void setTangentWeightMode(int value)
```


Legt den Gewichtungsmodus der Tangente des Schlüssels fest. Die Ausgangstangente oder die nächste Eingangs‑Tangente kann durch Auswahl des richtigen [WeightedMode](../../com.aspose.threed/weightedmode) angepasst werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setTension(float value) {#setTension-float-}
```
public void setTension(float value)
```


Setzt die Spannung, die im TCB‑Spline verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setTime(double value) {#setTime-double-}
```
public void setTime(double value)
```


Setzt die Zeitposition des Schlüsselbilds list.data[index], gemessen in Sekunden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Neuer Wert |

### setTimeIndependentTangent(boolean value) {#setTimeIndependentTangent-boolean-}
```
public void setTimeIndependentTangent(boolean value)
```


Setzt, dass die Tangente zeitunabhängig ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setValue(float value) {#setValue-float-}
```
public void setValue(float value)
```


Setzt den Wert des Schlüsselbilds.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### toString() {#toString--}
```
public String toString()
```


Liefert die Zeichenkettenrepräsentation des Schlüsselbilds.

**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

