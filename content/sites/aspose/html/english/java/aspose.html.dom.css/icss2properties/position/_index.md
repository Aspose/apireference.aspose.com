---
title: ICSS2Properties.Position
second_title: Aspose.HTML for Java API Reference
description: ICSS2Properties property. The values of this property have the following meanings
type: docs

url: /java/com.aspose.html.dom.css/icss2properties/position/
---
## ICSS2Properties.Position property

The values of this property have the following meanings:

static - The box is a normal box, laid out according to the [normal flow](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#normal-flow). The ['left'](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#propdef-left) and ['top'](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#propdef-top) properties do not apply.relative - The box's position is calculated according to the [normal flow](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#normal-flow) (this is called the position in normal flow). Then the box is offset [relative](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#relative-positioning) to its normal position. When a box B is relatively positioned, the position of the following box is calculated as though B were not offset.absolute - The box's position (and possibly size) is specified with the ['left'](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#propdef-left), ['right'](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#propdef-right), ['top'](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#propdef-top), and ['bottom'](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#propdef-bottom) properties. These properties specify offsets with respect to the box's [containing block](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#containing-block). Absolutely positioned boxes are taken out of the normal flow. This means they have no impact on the layout of later siblings. Also, though [absolutely positioned](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#absolutely-positioned) boxes have margins, they do not [collapse](https://www.w3.org/TR/1998/REC-CSS2-19980512/box.html#collapsing-margins) with any other margins.fixed - The box's position is calculated according to the 'absolute' model, but in addition, the box is [fixed](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#fixed-positioning) with respect to some reference. In the case of [continuous media](https://www.w3.org/TR/1998/REC-CSS2-19980512/media.html#continuous-media-group), the box is fixed with respect to the [viewport](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#viewport) (and doesn't move when scrolled). In the case of [paged media](https://www.w3.org/TR/1998/REC-CSS2-19980512/media.html#paged-media-group), the box is fixed with respect to the page, even if that page is seen through a [viewport](https://www.w3.org/TR/1998/REC-CSS2-19980512/visuren.html#viewport) (in the case of a print-preview, for example). Authors may wish to specify 'fixed' in a media-dependent way.

```java
public String Position { get; set; }
```

### Return Value

position property

### See Also

* interface [ICSS2Properties](../)
* package [com.aspose.html.dom.css](../../../com.aspose.html.dom.css/)
* package [Aspose.HTML](../../../)
