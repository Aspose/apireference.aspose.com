---
title: ICSSStyleDeclaration.GetPropertyCSSValue
second_title: Aspose.HTML for Java API Reference
description: ICSSStyleDeclaration method. Used to retrieve the object representation of the value of a CSS property if it has been explicitly set within this declaration block. This method returns null if the property is a shorthand property. Shorthand property values can only be accessed and modified as Strings using the getPropertyValue and setProperty methods
type: docs

url: /java/com.aspose.html.dom.css/icssstyledeclaration/getpropertycssvalue/
---
## ICSSStyleDeclaration.GetPropertyCSSValue method

Used to retrieve the object representation of the value of a CSS property if it has been explicitly set within this declaration block. This method returns null if the property is a shorthand property. Shorthand property values can only be accessed and modified as Strings, using the getPropertyValue and setProperty methods.

```java
public CSSValue GetPropertyCSSValue(String propertyName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | String | propertyName is a String representing the property name to be retrieved. |

### Return Value

value is a CSSValue containing the CSS value for a property. If none exists, returns null.

### See Also

* class [CSSValue](../../cssvalue/)
* interface [ICSSStyleDeclaration](../)
* package [com.aspose.html.dom.css](../../../com.aspose.html.dom.css/)
* package [Aspose.HTML](../../../)
