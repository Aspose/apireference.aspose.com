---
title: IOmrElement
second_title: Aspose.OMR for Java API Reference
description: The interface for the OMR elements
type: docs
weight: 30
url: /java/com.aspose.omr/iomrelement/
---
```
public interface IOmrElement
```

The interface for the OMR elements
## Methods

| Method | Description |
| --- | --- |
| [getAnswer()](#getAnswer) | Forms a string with recognition result |
| [getCsv()](#getCsv) | Forms answers as a comma-separated values string |
| [getQuestionName()](#getQuestionName) | Gets the Question Name |
| [setQuestionName(String value)](#setQuestionName-java.lang.String) | Sets the Question Name |
### getAnswer() {#getAnswer}
```
public abstract String getAnswer()
```


Forms a string with recognition result

**Returns:**
java.lang.String - String containing recognition result
### getCsv() {#getCsv}
```
public abstract String getCsv()
```


Forms answers as a comma-separated values string

**Returns:**
java.lang.String - The recognition results as CSV string
### getQuestionName() {#getQuestionName}
```
public abstract String getQuestionName()
```


Gets the Question Name

**Returns:**
java.lang.String - the Question Name
### setQuestionName(String value) {#setQuestionName-java.lang.String}
```
public abstract void setQuestionName(String value)
```


Sets the Question Name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | the Question Name |

