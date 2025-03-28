---
title: ISequence
second_title: Aspose.Slides for Java API Reference
description: Represents sequence collection of effects.
type: docs
weight: 1014
url: /java/com.aspose.slides/isequence/
---
**All Implemented Interfaces:**
com.aspose.ms.System.Collections.Generic.IGenericEnumerable
```
public interface ISequence extends System.Collections.Generic.IGenericEnumerable<IEffect>
```

Represents sequence (collection of effects).
## Methods

| Method | Description |
| --- | --- |
| [getCount()](#getCount--) | Returns the number of effects in a sequense. |
| [remove(IEffect item)](#remove-com.aspose.slides.IEffect-) | Removes specified effect from a collection. |
| [removeAt(int index)](#removeAt-int-) | Removes an effect from a collection. |
| [clear()](#clear--) | Removes all effects from a collection. |
| [get_Item(int index)](#get-Item-int-) | Returns an effect at the specified index. |
| [getTriggerShape()](#getTriggerShape--) | Returns or sets shape target for INTERACTIVE sequence. |
| [setTriggerShape(IShape value)](#setTriggerShape-com.aspose.slides.IShape-) | Returns or sets shape target for INTERACTIVE sequence. |
| [removeByShape(IShape shape)](#removeByShape-com.aspose.slides.IShape-) | Remove effect for the specified shape. |
| [getEffectsByShape(IShape shape)](#getEffectsByShape-com.aspose.slides.IShape-) | Returns array of effects for the specified shape. |
| [getEffectsByParagraph(IParagraph paragraph)](#getEffectsByParagraph-com.aspose.slides.IParagraph-) | Returns array of effects for the specified paragraph. |
| [getCount(IShape shape)](#getCount-com.aspose.slides.IShape-) | Returns count of effects for the specified shape. |
| [addEffect(IShape shape, int effectType, int subtype, int triggerType)](#addEffect-com.aspose.slides.IShape-int-int-int-) | Add new effect to the end of sequence. |
| [addEffect(IParagraph paragraph, int effectType, int subtype, int triggerType)](#addEffect-com.aspose.slides.IParagraph-int-int-int-) | Add new animation effect for paragraph to the end of sequence. |
| [addEffect(IChart chart, int type, int index, int effectType, int subtype, int triggerType)](#addEffect-com.aspose.slides.IChart-int-int-int-int-int-) | Adds the new chart animation effect for category or series to the end of sequence. |
| [addEffect(IChart chart, int type, int seriesIndex, int categoriesIndex, int effectType, int subtype, int triggerType)](#addEffect-com.aspose.slides.IChart-int-int-int-int-int-int-) | Adds the new chart animation effect for elements in category or series to the end of sequence. |
### getCount() {#getCount--}
```
public abstract int getCount()
```


Returns the number of effects in a sequense. Read-only int.

**Returns:**
int
### remove(IEffect item) {#remove-com.aspose.slides.IEffect-}
```
public abstract void remove(IEffect item)
```


Removes specified effect from a collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| item | [IEffect](../../com.aspose.slides/ieffect) | Effect to remove. |

### removeAt(int index) {#removeAt-int-}
```
public abstract void removeAt(int index)
```


Removes an effect from a collection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index of effect to remove int |

### clear() {#clear--}
```
public abstract void clear()
```


Removes all effects from a collection.

### get_Item(int index) {#get-Item-int-}
```
public abstract IEffect get_Item(int index)
```


Returns an effect at the specified index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index of element. |

**Returns:**
[IEffect](../../com.aspose.slides/ieffect) - The [IEffect](../../com.aspose.slides/ieffect) object.
### getTriggerShape() {#getTriggerShape--}
```
public abstract IShape getTriggerShape()
```


Returns or sets shape target for INTERACTIVE sequence. If sequence is not interactive then returns null. Read/write [IShape](../../com.aspose.slides/ishape).

**Returns:**
[IShape](../../com.aspose.slides/ishape)
### setTriggerShape(IShape value) {#setTriggerShape-com.aspose.slides.IShape-}
```
public abstract void setTriggerShape(IShape value)
```


Returns or sets shape target for INTERACTIVE sequence. If sequence is not interactive then returns null. Read/write [IShape](../../com.aspose.slides/ishape).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IShape](../../com.aspose.slides/ishape) |  |

### removeByShape(IShape shape) {#removeByShape-com.aspose.slides.IShape-}
```
public abstract void removeByShape(IShape shape)
```


Remove effect for the specified shape.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shape | [IShape](../../com.aspose.slides/ishape) | Shape object [IShape](../../com.aspose.slides/ishape) |

### getEffectsByShape(IShape shape) {#getEffectsByShape-com.aspose.slides.IShape-}
```
public abstract IEffect[] getEffectsByShape(IShape shape)
```


Returns array of effects for the specified shape.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shape | [IShape](../../com.aspose.slides/ishape) | Shape object [IShape](../../com.aspose.slides/ishape) |

**Returns:**
com.aspose.slides.IEffect[] - Array of effects [IEffect](../../com.aspose.slides/ieffect)
### getEffectsByParagraph(IParagraph paragraph) {#getEffectsByParagraph-com.aspose.slides.IParagraph-}
```
public abstract IEffect[] getEffectsByParagraph(IParagraph paragraph)
```


Returns array of effects for the specified paragraph.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| paragraph | [IParagraph](../../com.aspose.slides/iparagraph) | Paragraph object [IParagraph](../../com.aspose.slides/iparagraph) |

**Returns:**
com.aspose.slides.IEffect[] - Array of effects [IEffect](../../com.aspose.slides/ieffect)
### getCount(IShape shape) {#getCount-com.aspose.slides.IShape-}
```
public abstract int getCount(IShape shape)
```


Returns count of effects for the specified shape.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shape | [IShape](../../com.aspose.slides/ishape) | Shape object [IShape](../../com.aspose.slides/ishape) |

**Returns:**
int - Count of effects int
### addEffect(IShape shape, int effectType, int subtype, int triggerType) {#addEffect-com.aspose.slides.IShape-int-int-int-}
```
public abstract IEffect addEffect(IShape shape, int effectType, int subtype, int triggerType)
```


Add new effect to the end of sequence.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| shape | [IShape](../../com.aspose.slides/ishape) | Shape object [IShape](../../com.aspose.slides/ishape) for adding an effect |
| effectType | int | Type of an animation effect [EffectType](../../com.aspose.slides/effecttype) |
| subtype | int | Subtypes of animation effect [EffectSubtype](../../com.aspose.slides/effectsubtype) |
| triggerType | int | Trigger type of effect [EffectTriggerType](../../com.aspose.slides/effecttriggertype) |

**Returns:**
[IEffect](../../com.aspose.slides/ieffect) - New effect object [IEffect](../../com.aspose.slides/ieffect)
### addEffect(IParagraph paragraph, int effectType, int subtype, int triggerType) {#addEffect-com.aspose.slides.IParagraph-int-int-int-}
```
public abstract IEffect addEffect(IParagraph paragraph, int effectType, int subtype, int triggerType)
```


Add new animation effect for paragraph to the end of sequence.

--------------------

> ```
> Presentation presentation = new Presentation(path + "input.pptx");
>  try
>  {
>     // select paragraph to add effect
>     IAutoShape autoShape = (IAutoShape)presentation.getSlides().get_Item(0).getShapes().get_Item(0);
>     IParagraph paragraph = autoShape.getTextFrame().getParagraphs().get_Item(0);
>     // add Fly animation effect to selected paragraph
>     IEffect effect = presentation.getSlides().get_Item(0).getTimeline().getMainSequence().addEffect(
>     paragraph, EffectType.Fly, EffectSubtype.Left, EffectTriggerType.OnClick);
>  } finally {
>     if (presentation != null) presentation.dispose();
>  }
> ```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| paragraph | [IParagraph](../../com.aspose.slides/iparagraph) | Paragraph object [IParagraph](../../com.aspose.slides/iparagraph) |
| effectType | int | Type of an animation effect [EffectType](../../com.aspose.slides/effecttype) |
| subtype | int | Subtypes of animation effect [EffectSubtype](../../com.aspose.slides/effectsubtype) |
| triggerType | int | Trigger type of effect [EffectTriggerType](../../com.aspose.slides/effecttriggertype) |

**Returns:**
[IEffect](../../com.aspose.slides/ieffect) - New effect object [IEffect](../../com.aspose.slides/ieffect)
### addEffect(IChart chart, int type, int index, int effectType, int subtype, int triggerType) {#addEffect-com.aspose.slides.IChart-int-int-int-int-int-}
```
public abstract IEffect addEffect(IChart chart, int type, int index, int effectType, int subtype, int triggerType)
```


Adds the new chart animation effect for category or series to the end of sequence.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| chart | [IChart](../../com.aspose.slides/ichart) | Chart object [IChart](../../com.aspose.slides/ichart) |
| type | int | Type of an animation effect [EffectChartMinorGroupingType](../../com.aspose.slides/effectchartminorgroupingtype) |
| index | int | Index int |
| effectType | int | Type of an animation effect [EffectType](../../com.aspose.slides/effecttype) |
| subtype | int | Subtypes of animation effect [EffectSubtype](../../com.aspose.slides/effectsubtype) |
| triggerType | int | Trigger type of effect [EffectTriggerType](../../com.aspose.slides/effecttriggertype) |

**Returns:**
[IEffect](../../com.aspose.slides/ieffect) - New effect object [IEffect](../../com.aspose.slides/ieffect)
### addEffect(IChart chart, int type, int seriesIndex, int categoriesIndex, int effectType, int subtype, int triggerType) {#addEffect-com.aspose.slides.IChart-int-int-int-int-int-int-}
```
public abstract IEffect addEffect(IChart chart, int type, int seriesIndex, int categoriesIndex, int effectType, int subtype, int triggerType)
```


Adds the new chart animation effect for elements in category or series to the end of sequence.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| chart | [IChart](../../com.aspose.slides/ichart) | Chart object [IChart](../../com.aspose.slides/ichart) |
| type | int | Type of an animation effect [EffectChartMinorGroupingType](../../com.aspose.slides/effectchartminorgroupingtype) |
| seriesIndex | int | Index of chart series int |
| categoriesIndex | int | Index of category int |
| effectType | int | Type of an animation effect [EffectType](../../com.aspose.slides/effecttype) |
| subtype | int | Subtypes of animation effect [EffectSubtype](../../com.aspose.slides/effectsubtype) |
| triggerType | int | Trigger type of effect [EffectTriggerType](../../com.aspose.slides/effecttriggertype) |

**Returns:**
[IEffect](../../com.aspose.slides/ieffect) - New effect object [IEffect](../../com.aspose.slides/ieffect)
