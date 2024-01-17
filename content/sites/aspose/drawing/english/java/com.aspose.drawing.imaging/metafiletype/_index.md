---
title: MetafileType
second_title: Aspose.Drawing for Java API Reference
description: Specifies types of metafiles.
type: docs
weight: 33
url: /java/com.aspose.drawing.imaging/metafiletype/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class MetafileType extends System.Enum
```

Specifies types of metafiles.
## Fields

| Field | Description |
| --- | --- |
| [Invalid](#Invalid) | Specifies a metafile format that is not recognized in GDI+. |
| [Wmf](#Wmf) | Specifies a WMF (Windows Metafile) file. |
| [WmfPlaceable](#WmfPlaceable) | Specifies a WMF (Windows Metafile) file that has a placeable metafile header in front of it. |
| [Emf](#Emf) | Specifies an Enhanced Metafile (EMF) file. |
| [EmfPlusOnly](#EmfPlusOnly) | Specifies an EMF+ file. |
| [EmfPlusDual](#EmfPlusDual) | Specifies an EMF+ Dual file. |
### Invalid {#Invalid}
```
public static final int Invalid
```


Specifies a metafile format that is not recognized in GDI+.

### Wmf {#Wmf}
```
public static final int Wmf
```


Specifies a WMF (Windows Metafile) file. Such a file contains only GDI records.

### WmfPlaceable {#WmfPlaceable}
```
public static final int WmfPlaceable
```


Specifies a WMF (Windows Metafile) file that has a placeable metafile header in front of it.

### Emf {#Emf}
```
public static final int Emf
```


Specifies an Enhanced Metafile (EMF) file. Such a file contains only GDI records.

### EmfPlusOnly {#EmfPlusOnly}
```
public static final int EmfPlusOnly
```


Specifies an EMF+ file. Such a file contains only GDI+ records and must be displayed by using GDI+. Displaying the records using GDI may cause unpredictable results.

### EmfPlusDual {#EmfPlusDual}
```
public static final int EmfPlusDual
```


Specifies an EMF+ Dual file. Such a file contains GDI+ records along with alternative GDI records and can be displayed by using either GDI or GDI+. Displaying the records using GDI may cause some quality degradation.

