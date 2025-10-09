---
title: ConversionOptions Class
type: docs
weight: 380
url: /python-net/aspose.gis/conversionoptions/
---

**Summary:** Options for converting data between formats.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.ConversionOptions

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [ConversionOptions()](#ConversionOptions__1) | Initializes a new instance of the ConversionOptions class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| attributes_converter | [IAttributesConverter](/psd/python-net/aspose.gis/iattributesconverter) | r/w | A custom converter for attributes. It allows us to rename or exclude destination attributes.<br/>            If not <see langword="null" />, it is called for each attribute of the source layer and is expected to change it if necessary. |
| destination_driver_options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | r/w | Driver-specific options for the destination layer. |
| destination_spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r/w | Spatial reference system to assign to destination layer. |
| source_driver_options | [DriverOptions](/psd/python-net/aspose.gis/driveroptions) | r/w | Driver-specific options for the source layer. |


### Constructor: ConversionOptions() {#ConversionOptions__1}


```
 ConversionOptions() 
```

Initializes a new instance of the ConversionOptions class

