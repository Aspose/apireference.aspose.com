---
title: UserProperties
second_title: Aspose.Page for .NET API Reference
description: 
type: docs
weight: 200
url: /net/aspose.page/userproperties/
---
## UserProperties class

Special property class which allows typed properties to be set and returned. It also allows the hookup of two default property objects to be searched if this property object does not contain the property.

```csharp
public class UserProperties : Dictionary<string, object>
```

## Constructors

| Name | Description |
| --- | --- |
| [UserProperties](userproperties)() | Initializes an empty instance of UserProperties class. |
| [UserProperties](userproperties)(Dictionary&lt;string, object&gt;) | Initializes an of UserProperties class with default values. |
| [UserProperties](userproperties)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | Constructs UserProperties with a defaults and altDefaults table, which are searched in that order. |

## Properties

| Name | Description |
| --- | --- |
| virtual [Properties](properties) { set; } | Copies properties, including its defaults into this UserProperties |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetProperty](getproperty)(string) | Gets string property value. |
| virtual [GetProperty](getproperty)(string, string) | Gets string property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyColor](getpropertycolor)(string) | Gets color property value. |
| virtual [GetPropertyColor](getpropertycolor)(string, Color) | Gets color property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyDouble](getpropertydouble)(string) | Gets double property value. |
| virtual [GetPropertyDouble](getpropertydouble)(string, double) | Gets double property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyFloat](getpropertyfloat)(string) | Gets float property value. |
| virtual [GetPropertyFloat](getpropertyfloat)(string, float) | Gets float property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyInt](getpropertyint)(string) | Gets integer property value. |
| virtual [GetPropertyInt](getpropertyint)(string, int) | Gets integer property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyMargins](getpropertymargins)(string) | Gets margins property value. |
| virtual [GetPropertyMargins](getpropertymargins)(string, Margins) | Gets margins property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyRectangle](getpropertyrectangle)(string) | Gets rectangle property value. |
| virtual [GetPropertyRectangle](getpropertyrectangle)(string, RectangleF) | Gets rectangle property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertySize](getpropertysize)(string) | Gets size property value. |
| virtual [GetPropertySize](getpropertysize)(string, Size) | Gets size property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyStringArray](getpropertystringarray)(string) | Gets string array property value. |
| virtual [GetPropertyStringArray](getpropertystringarray)(string, string[]) | Gets string array property value. If requested property is absent, returns provided default value. |
| virtual [IsProperty](isproperty)(string) | Gets boolean property value. |
| virtual [IsProperty](isproperty)(string, bool) | Gets boolean property value. If requested property is absent, returns provided default value. |
| virtual [PropertyNames](propertynames)() | Returns properties names. |
| virtual [SetProperty](setproperty)(string, bool) | Sets boolean property value. |
| virtual [SetProperty](setproperty)(string, Color) | Sets color property value. |
| virtual [SetProperty](setproperty)(string, double) | Sets double property value. |
| virtual [SetProperty](setproperty)(string, float) | Sets float property value. |
| virtual [SetProperty](setproperty)(string, int) | Sets integer property value. |
| virtual [SetProperty](setproperty)(string, Margins) | Sets margins property value. |
| virtual [SetProperty](setproperty)(string, Rectangle) | Sets rectangle property value. |
| virtual [SetProperty](setproperty)(string, Size) | Sets size property value. |
| virtual [SetProperty](setproperty)(string, string) | Sets string property value. |
| virtual [SetProperty](setproperty)(string, string[]) | Sets string array property value. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, bool) | Sets boolean property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, Color) | Sets color property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, double) | Sets double property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, float) | Sets float property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, int) | Sets integer property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | Sets margins property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, Rectangle) | Sets rectangle property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, Size) | Sets size property value in specified properties table. |
| static [SetProperty](setproperty)(Dictionary&lt;string, object&gt;, string, string[]) | Sets string array property value in specified properties table. |

### See Also

* namespace [Aspose.Page](../../aspose.page)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
