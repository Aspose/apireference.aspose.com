---
title: PageConstants
second_title: Aspose.Page for Java API Reference
description: This class defines a set of constants which describe a page.
type: docs
weight: 13
url: /java/com.aspose.eps/pageconstants/
---
**Inheritance:**
java.lang.Object
```
public class PageConstants
```

This class defines a set of constants which describe a page. Convenience objects are provided for various margins, orientations, rescaling, and standard page sizes.
## Fields

| Field | Description |
| --- | --- |
| [BACKGROUND](#BACKGROUND) | Background key |
| [BACKGROUND_COLOR](#BACKGROUND-COLOR) | Background color key |
| [FIT_TO_PAGE](#FIT-TO-PAGE) | Fit content to page key |
| [MARGINS_LARGE](#MARGINS-LARGE) | "Large" page margins value |
| [MARGINS_MEDIUM](#MARGINS-MEDIUM) | "Medium" page margins value |
| [MARGINS_SMALL](#MARGINS-SMALL) | "Small" page margins value |
| [MARGINS_ZERO](#MARGINS-ZERO) | "Zero" page margins value |
| [ORIENTATION](#ORIENTATION) | Orientation key, for the named orienation of page, Portret or Landscape. |
| [ORIENTATION_BEST_FIT](#ORIENTATION-BEST-FIT) | "Best fit" orientation value |
| [ORIENTATION_LANDSCAPE](#ORIENTATION-LANDSCAPE) | "Landscape" orientation value |
| [ORIENTATION_PORTRAIT](#ORIENTATION-PORTRAIT) | "Portrait" orientation value |
| [PAGE_MARGINS](#PAGE-MARGINS) | Page margins key |
| [PAGE_SIZE](#PAGE-SIZE) | Page size key |
| [SIZE_A3](#SIZE-A3) | "A3" page size value |
| [SIZE_A4](#SIZE-A4) | "A4" page size value |
| [SIZE_A5](#SIZE-A5) | "A5" page size value |
| [SIZE_A6](#SIZE-A6) | "A6" page size value |
| [SIZE_EXECUTIVE](#SIZE-EXECUTIVE) | "Executive" page size value |
| [SIZE_INTERNATIONAL](#SIZE-INTERNATIONAL) | "International" page size value |
| [SIZE_LEDGER](#SIZE-LEDGER) | "Ledger" page size value |
| [SIZE_LEGAL](#SIZE-LEGAL) | "Legal" page size value |
| [SIZE_LETTER](#SIZE-LETTER) | "Letter" page size value |
| [TRANSPARENT](#TRANSPARENT) | Transparent background key |
| [VIEWING_ORIENTATION](#VIEWING-ORIENTATION) | Viewing orientation key, for rotation matrix distinguishing orientation of content on the page. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMargins(Insets insets, String orientation)](#getMargins-java.awt.Insets-java.lang.String-) | Calculate page margins in specified orientation |
| [getMargins(String size)](#getMargins-java.lang.String-) |  |
| [getOrientationList()](#getOrientationList--) |  |
| [getSize(Dimension size, String orientation)](#getSize-java.awt.Dimension-java.lang.String-) | Calculates page size in given page orientation |
| [getSize(String size)](#getSize-java.lang.String-) | Calculates page size in "Portrait" page orientation |
| [getSize(String size, String orientation)](#getSize-java.lang.String-java.lang.String-) | Calculates page size in given page orientation |
| [getSizeList()](#getSizeList--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BACKGROUND {#BACKGROUND}
```
public static final String BACKGROUND
```


Background key

### BACKGROUND_COLOR {#BACKGROUND-COLOR}
```
public static final String BACKGROUND_COLOR
```


Background color key

### FIT_TO_PAGE {#FIT-TO-PAGE}
```
public static final String FIT_TO_PAGE
```


Fit content to page key

### MARGINS_LARGE {#MARGINS-LARGE}
```
public static final String MARGINS_LARGE
```


"Large" page margins value

### MARGINS_MEDIUM {#MARGINS-MEDIUM}
```
public static final String MARGINS_MEDIUM
```


"Medium" page margins value

### MARGINS_SMALL {#MARGINS-SMALL}
```
public static final String MARGINS_SMALL
```


"Small" page margins value

### MARGINS_ZERO {#MARGINS-ZERO}
```
public static final String MARGINS_ZERO
```


"Zero" page margins value

### ORIENTATION {#ORIENTATION}
```
public static final String ORIENTATION
```


Orientation key, for the named orienation of page, Portret or Landscape.

### ORIENTATION_BEST_FIT {#ORIENTATION-BEST-FIT}
```
public static final String ORIENTATION_BEST_FIT
```


"Best fit" orientation value

### ORIENTATION_LANDSCAPE {#ORIENTATION-LANDSCAPE}
```
public static final String ORIENTATION_LANDSCAPE
```


"Landscape" orientation value

### ORIENTATION_PORTRAIT {#ORIENTATION-PORTRAIT}
```
public static final String ORIENTATION_PORTRAIT
```


"Portrait" orientation value

### PAGE_MARGINS {#PAGE-MARGINS}
```
public static final String PAGE_MARGINS
```


Page margins key

### PAGE_SIZE {#PAGE-SIZE}
```
public static final String PAGE_SIZE
```


Page size key

### SIZE_A3 {#SIZE-A3}
```
public static final String SIZE_A3
```


"A3" page size value

### SIZE_A4 {#SIZE-A4}
```
public static final String SIZE_A4
```


"A4" page size value

### SIZE_A5 {#SIZE-A5}
```
public static final String SIZE_A5
```


"A5" page size value

### SIZE_A6 {#SIZE-A6}
```
public static final String SIZE_A6
```


"A6" page size value

### SIZE_EXECUTIVE {#SIZE-EXECUTIVE}
```
public static final String SIZE_EXECUTIVE
```


"Executive" page size value

### SIZE_INTERNATIONAL {#SIZE-INTERNATIONAL}
```
public static final String SIZE_INTERNATIONAL
```


"International" page size value

### SIZE_LEDGER {#SIZE-LEDGER}
```
public static final String SIZE_LEDGER
```


"Ledger" page size value

### SIZE_LEGAL {#SIZE-LEGAL}
```
public static final String SIZE_LEGAL
```


"Legal" page size value

### SIZE_LETTER {#SIZE-LETTER}
```
public static final String SIZE_LETTER
```


"Letter" page size value

### TRANSPARENT {#TRANSPARENT}
```
public static final String TRANSPARENT
```


Transparent background key

### VIEWING_ORIENTATION {#VIEWING-ORIENTATION}
```
public static final String VIEWING_ORIENTATION
```


Viewing orientation key, for rotation matrix distinguishing orientation of content on the page. The default viewing orientation matrix is identity.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMargins(Insets insets, String orientation) {#getMargins-java.awt.Insets-java.lang.String-}
```
public static final Insets getMargins(Insets insets, String orientation)
```


Calculate page margins in specified orientation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| insets | java.awt.Insets | Original margins |
| orientation | java.lang.String | The page orientation |

**Returns:**
java.awt.Insets - predefined page margins for given orientation
### getMargins(String size) {#getMargins-java.lang.String-}
```
public static final Insets getMargins(String size)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.lang.String | predefined page size |

**Returns:**
java.awt.Insets - predefined page margins
### getOrientationList() {#getOrientationList--}
```
public static final String[] getOrientationList()
```




**Returns:**
java.lang.String[] - available orientation values
### getSize(Dimension size, String orientation) {#getSize-java.awt.Dimension-java.lang.String-}
```
public static final Dimension getSize(Dimension size, String orientation)
```


Calculates page size in given page orientation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.awt.Dimension | Original page size |
| orientation | java.lang.String | The page orientation |

**Returns:**
java.awt.Dimension - calculated page size
### getSize(String size) {#getSize-java.lang.String-}
```
public static final Dimension getSize(String size)
```


Calculates page size in "Portrait" page orientation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.lang.String | predefined page size |

**Returns:**
java.awt.Dimension - calculated page size
### getSize(String size, String orientation) {#getSize-java.lang.String-java.lang.String-}
```
public static final Dimension getSize(String size, String orientation)
```


Calculates page size in given page orientation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| size | java.lang.String | predefined page size |
| orientation | java.lang.String | the page orientation |

**Returns:**
java.awt.Dimension - calculated page size
### getSizeList() {#getSizeList--}
```
public static final String[] getSizeList()
```




**Returns:**
java.lang.String[] - available page size values
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




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

