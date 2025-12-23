---
title: CSSPrimitiveValue class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg.dom.css/cssprimitivevalue/
is_root: false
---

## CSSPrimitiveValue class

The CSSPrimitiveValue interface represents a single CSS value. This interface may be used to determine the value of a specific style property currently set in a block or to set a specific style property explicitly within the block. An instance of this interface might be obtained from the getPropertyCSSValue method of the CSSStyleDeclaration interface. A CSSPrimitiveValue object only occurs in a context of a CSS property.



**Inheritance:** [`CSSPrimitiveValue`](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue) → 
[`CSSValue`](/svg/python-net/aspose.svg.dom.css/cssvalue) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The CSSPrimitiveValue type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [css_text](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_text) | The  property of the [`CSSValue`](/svg/python-net/aspose.svg.dom.css/cssvalue) interface represents the current computed CSS property value. |
| [css_value_type](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_value_type) | A code defining the type of the value. |
| [CSS_INHERIT](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_inherit) | The value is inherited and the cssText contains "inherit". |
| [CSS_PRIMITIVE_VALUE](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_primitive_value) | The value is a primitive value and an instance of the CSSPrimitiveValue interface can be obtained by using binding-specific casting methods on this instance of the CSSValue interface. |
| [CSS_VALUE_LIST](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_value_list) | The value is a CSSValue list and an instance of the CSSValueList interface can be obtained by using binding-specific casting methods on this instance of the CSSValue interface. |
| [CSS_CUSTOM](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_custom) | The value is a custom value. |
| [primitive_type](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/primitive_type) | The type of the value as defined by the constants specified above. |
| [CSS_UNKNOWN](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_unknown) | The value is not a recognized CSS2 value. The value can only be obtained by using the cssText attribute. |
| [CSS_NUMBER](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_number) | The value is a simple number. The value can be obtained by using the getFloatValue method. |
| [CSS_PERCENTAGE](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_percentage) | The value is a percentage. The value can be obtained by using the getFloatValue method. |
| [CSS_EMS](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_ems) | The value is a length (ems). The value can be obtained by using the getFloatValue method. |
| [CSS_EXS](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_exs) | The value is a length (exs). The value can be obtained by using the getFloatValue method. |
| [CSS_PX](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_px) | The value is a length (px). The value can be obtained by using the getFloatValue method. |
| [CSS_CM](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_cm) | The value is a length (cm). The value can be obtained by using the getFloatValue method. |
| [CSS_MM](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_mm) | The value is a length (mm). The value can be obtained by using the getFloatValue method. |
| [CSS_IN](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_in) | The value is a length (in). The value can be obtained by using the getFloatValue method. |
| [CSS_PT](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_pt) | The value is a length (pt). The value can be obtained by using the getFloatValue method. |
| [CSS_PC](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_pc) | The value is a length (pc). The value can be obtained by using the getFloatValue method. |
| [CSS_DEG](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_deg) | The value is an angle (deg). The value can be obtained by using the getFloatValue method. |
| [CSS_RAD](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_rad) | The value is an angle (rad). The value can be obtained by using the getFloatValue method. |
| [CSS_GRAD](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_grad) | The value is an angle (grad). The value can be obtained by using the getFloatValue method. |
| [CSS_MS](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_ms) | The value is a time (ms). The value can be obtained by using the getFloatValue method. |
| [CSS_S](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_s) | The value is a time (s). The value can be obtained by using the getFloatValue method. |
| [CSS_HZ](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_hz) | The value is a frequency (Hz). The value can be obtained by using the getFloatValue method. |
| [CSS_KHZ](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_khz) | The value is a frequency (kHz). The value can be obtained by using the getFloatValue method. |
| [CSS_DIMENSION](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_dimension) | The value is a number with an unknown dimension. The value can be obtained by using the getFloatValue method. |
| [CSS_REM](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_rem) | The value is a length (rem). The value can be obtained by using the getFloatValue method. |
| [CSS_CH](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_ch) | The value is a length (ch). The value can be obtained by using the getFloatValue method. |
| [CSS_STRING](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_string) | The value is a STRING. The value can be obtained by using the getStringValue method. |
| [CSS_URI](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_uri) | The value is a URI. The value can be obtained by using the getStringValue method. |
| [CSS_IDENT](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_ident) | The value is an identifier. The value can be obtained by using the getStringValue method. |
| [CSS_ATTR](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_attr) | The value is a attribute function. The value can be obtained by using the getStringValue method. |
| [CSS_COUNTER](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_counter) | The value is a counter or counters function. The value can be obtained by using the GetCounterValue method. |
| [CSS_RECT](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_rect) | The value is a rect function. The value can be obtained by using the GetRectValue method. |
| [CSS_RGBCOLOR](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor) | The value is a RGB color. The value can be obtained by using the GetRGBColorValue method. |
| [CSS_DPI](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_dpi) | The value is a dots per inch (dpi). |
| [CSS_DPCM](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_dpcm) | The value is a dots per centimeter (dpcm). |
| [CSS_DPPX](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_dppx) | The value is a dots per ‘px’ unit (dppx). |
| [CSS_VW](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_vw) | The value is a percentage of the full viewport width. |
| [CSS_VH](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_vh) | The value is a percentage of the full viewport height. |
| [CSS_VMIN](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_vmin) | The value is a percentage of the viewport width or height, whichever is smaller. |
| [CSS_VMAX](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_vmax) | The value is a percentage of the viewport width or height, whichever is larger. |
| [CSS_X](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_x) | The value is a dots per ‘px’ unit (x). |
| [CSS_FR](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/css_fr) | A flexible length or flex is a dimension with the fr unit, which represents a fraction of the leftover space in the grid container |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/get_platform_type/#) | This method is used to retrieve ECMAScript object Type. |
| [set_float_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/set_float_value/#int-float) | A method to set the float value with a specified unit. If the property attached with this value can not accept the specified unit or the float value, the value will be unchanged and a DOMException will be raised. |
| [get_float_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/get_float_value/#int) | This method is used to get a float value in a specified unit. If this CSS value doesn't contain a float value or can't be converted into the specified unit, a DOMException is raised. |
| [set_int_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/set_int_value/#int-int) | A method to set the int value with a specified unit. If the property attached with this value can not accept the specified unit or the int value, the value will be unchanged and a DOMException will be raised. |
| [get_int_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/get_int_value/#int) | This method is used to get an int value in a specified unit. If this CSS value doesn't contain an int value or can't be converted into the specified unit, a DOMException is raised. |
| [set_string_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/set_string_value/#int-str) | A method to set the string value with the specified unit. If the property attached to this value can't accept the specified unit or the string value, the value will be unchanged and a DOMException will be raised. |
| [get_string_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/get_string_value/#) | This method is used to get the string value. If the CSS value doesn't contain a string value, a DOMException is raised. |
| [get_counter_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/get_counter_value/#) | This method is used to get the Counter value. If this CSS value doesn't contain a counter value, a DOMException is raised. Modification to the corresponding style property can be achieved using the Counter interface. |
| [get_rect_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/get_rect_value/#) | This method is used to get the Rect value. If this CSS value doesn't contain a rect value, a DOMException is raised. Modification to the corresponding style property can be achieved using the Rect interface. |
| [get_rgb_color_value](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue/get_rgb_color_value/#) | This method is used to get the RGB color. If this CSS value doesn't contain a RGB color value, a DOMException is raised. Modification to the corresponding style property can be achieved using the RGBColor interface. |



### See Also
* module [`aspose.svg.dom.css`](..)
* class [`CSSPrimitiveValue`](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue)
* class [`CSSValue`](/svg/python-net/aspose.svg.dom.css/cssvalue)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
