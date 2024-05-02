---
title: PunctualLight class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 270
url: /python-net/aspose.cad.fileformats.glb/punctuallight/
is_root: false
---

## PunctualLight class

A directional, point, or spot light.



**Inheritance:** [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight) → 
[`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot) → 
[`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties) → 
[`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)



The PunctualLight type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [extensions](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/extensions) | Gets a collection of [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable) instances. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/extras) | Gets or sets the extras content of this instance. |
| [name](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [logical_parent](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/logical_parent) | Gets the [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance that owns this object. |
| [logical_index](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/logical_index) | Gets the zero-based index of this object in the Logical resources of [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata). |
| [light_type](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/light_type) | Gets the type of light. |
| [inner_cone_angle](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/inner_cone_angle) | Gets the Angle, in radians, from centre of spotlight where falloff begins.<br/>Must be greater than or equal to 0 and less than outerConeAngle. |
| [outer_cone_angle](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/outer_cone_angle) | Gets Angle, in radians, from centre of spotlight where falloff ends.<br/>Must be greater than innerConeAngle and less than or equal to PI / 2.0. |
| [intensity](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/intensity) | Gets or sets the Brightness of light in. The units that this is defined in depend on the type of light.<br/>point and spot lights use luminous intensity in candela (lm/sr) while directional<br/>lights use illuminance in lux (lm/m2) |
| [range](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/range) | Gets or sets a Hint defining a distance cutoff at which the light's intensity may be considered<br/>to have reached zero. Supported only for point and spot lights.<br/>When undefined, range is assumed to be infinite. |


### Methods
| Method | Description |
| :- | :- |
| [set_spot_cone](/cad/python-net/aspose.cad.fileformats.glb/punctuallight/set_spot_cone/#float-float) | Sets the cone angles for the [`PunctualLightType.SPOT`](/cad/python-net/aspose.cad.fileformats.glb/punctuallighttype#SPOT) light. |



### See Also
* module [`aspose.cad.fileformats.glb`](..)
* class [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)
* class [`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot)
* class [`PunctualLight`](/cad/python-net/aspose.cad.fileformats.glb/punctuallight)
