---
title: with_spot_cone method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 350
url: /python-net/aspose.cad.fileformats.glb.toolkit/toolkit/with_spot_cone/
is_root: false
---

## with_spot_cone {#aspose.cad.fileformats.glb.PunctualLight-float-float}

Sets the cone angles for the [`PunctualLightType.SPOT`](/cad/python-net/aspose.cad.fileformats.glb/punctuallighttype#SPOT) light.


### Returns 


This [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) instance.


```python
def with_spot_cone(self, light, inner_cone_angle, outer_cone_angle):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| light | [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) | This [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) instance. |
| inner_cone_angle | float | Gets the Angle, in radians, from centre of spotlight where falloff begins.<br/>Must be greater than or equal to 0 and less than outerConeAngle. |
| outer_cone_angle | float | Gets Angle, in radians, from centre of spotlight where falloff ends.<br/>Must be greater than innerConeAngle and less than or equal to PI / 2.0. |



### See Also
* module [`aspose.cad.fileformats.glb.toolkit`](../../)
* class [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight)
* class [`Toolkit`](/cad/python-net/aspose.cad.fileformats.glb.toolkit/toolkit)
