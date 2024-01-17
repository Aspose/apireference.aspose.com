---
title: EmfType
second_title: Aspose.Drawing for Java API Reference
description: Specifies the nature of the records that are placed in an Enhanced Metafile EMF file.
type: docs
weight: 18
url: /java/com.aspose.drawing.imaging/emftype/
---
**Inheritance:**
java.lang.Object, com.aspose.ms.System.ValueType, com.aspose.ms.System.Enum
```
public final class EmfType extends System.Enum
```

Specifies the nature of the records that are placed in an Enhanced Metafile (EMF) file. This enumeration is used by several constructors in the [Metafile](../../com.aspose.drawing.imaging/metafile) class.
## Fields

| Field | Description |
| --- | --- |
| [EmfOnly](#EmfOnly) | Specifies that all the records in the metafile are EMF records, which can be displayed by GDI or GDI+. |
| [EmfPlusOnly](#EmfPlusOnly) | Specifies that all the records in the metafile are EMF+ records, which can be displayed by GDI+ but not by GDI. |
| [EmfPlusDual](#EmfPlusDual) | Specifies that all EMF+ records in the metafile are associated with an alternate EMF record. |
### EmfOnly {#EmfOnly}
```
public static final int EmfOnly
```


Specifies that all the records in the metafile are EMF records, which can be displayed by GDI or GDI+.

### EmfPlusOnly {#EmfPlusOnly}
```
public static final int EmfPlusOnly
```


Specifies that all the records in the metafile are EMF+ records, which can be displayed by GDI+ but not by GDI.

### EmfPlusDual {#EmfPlusDual}
```
public static final int EmfPlusDual
```


Specifies that all EMF+ records in the metafile are associated with an alternate EMF record. Metafiles of type `F:EmfType.EmfPlusDual` can be displayed by GDI or by GDI+.

