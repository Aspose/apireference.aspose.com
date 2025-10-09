---
title: KmlIconStyle Class
type: docs
weight: 60
url: /python-net/aspose.gis.formats.kml.styles/kmliconstyle/
---

**Summary:** Specifies how icons for kml:Placemarks and kml:PhotoOverlay with a kml:Point geometry are drawn<br/>            in an earth browser's list and geographic views.

**Module:** [aspose.gis.formats.kml.styles](/psd/python-net/aspose.gis.formats.kml.styles/)

**Full Name:** aspose.gis.formats.kml.styles.KmlIconStyle

**Inheritance:** KmlAbstractColorStyle

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [KmlIconStyle()](#KmlIconStyle__1) | Initializes a new instance of the KmlIconStyle class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| color | System.Drawing.Color | r/w | Specifies the color of the graphic element. Default value . |
| color_mode | [KmlColorModes](/psd/python-net/aspose.gis.formats.kml.styles/kmlcolormodes) | r/w | Specifies the color mode of the graphic element. Default Value: normal. |
| heading | double | r/w | Direction (North, South, East, West), in decimal degrees. Values range from 0 (North) to 360 degrees. Default Value is '0'. |
| hot_spot | [KmlCoordinate](/psd/python-net/aspose.gis.formats.kml.styles/kmlcoordinate) | r/w | Specifies the position of the reference point on the icon that is anchored to the Point specified in the Placemark.<br/>            Default value is <see langword="null" /> means the HotSpot is missed. |
| resource | [KmlIconResource](/psd/python-net/aspose.gis.formats.kml.styles/kmliconresource) | r/w | Specifies the resource location. Default value is <see langword="null" /> means the Icon is missed. |
| scale | double | r/w | Specifies a scale factor that shall be applied to the graphic element. Default Value is '1'. |


### Constructor: KmlIconStyle() {#KmlIconStyle__1}


```
 KmlIconStyle() 
```

Initializes a new instance of the KmlIconStyle class

