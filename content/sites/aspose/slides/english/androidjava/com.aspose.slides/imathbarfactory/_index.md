---
title: IMathBarFactory
second_title: Aspose.Slides for Android via Java API Reference
description: Allows to create a math bar
type: docs
weight: 886
url: /androidjava/com.aspose.slides/imathbarfactory/
---```
public interface IMathBarFactory
```

Allows to create a math bar

--------------------

For COM comparibility
## Methods

| Method | Description |
| --- | --- |
| [createMathBar(IMathElement element)](#createMathBar-com.aspose.slides.IMathElement-) | Create a math bar by applying to the element |
| [createMathBar(IMathElement element, int position)](#createMathBar-com.aspose.slides.IMathElement-int-) | Create a math bar by applying to the element |
### createMathBar(IMathElement element) {#createMathBar-com.aspose.slides.IMathElement-}
```
public abstract IMathBar createMathBar(IMathElement element)
```


Create a math bar by applying to the element

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | [IMathElement](../../com.aspose.slides/imathelement) | math element to apply bar |

**Returns:**
[IMathBar](../../com.aspose.slides/imathbar) - new math bar element
### createMathBar(IMathElement element, int position) {#createMathBar-com.aspose.slides.IMathElement-int-}
```
public abstract IMathBar createMathBar(IMathElement element, int position)
```


Create a math bar by applying to the element

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | [IMathElement](../../com.aspose.slides/imathelement) | Math element to apply bar |
| position | int | Position of the bar |

**Returns:**
[IMathBar](../../com.aspose.slides/imathbar) - new math bar element
