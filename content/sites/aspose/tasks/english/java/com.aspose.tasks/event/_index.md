---
title: Event
second_title: Aspose.Tasks for Java API Reference
description: An event.
type: docs
weight: 367
url: /java/com.aspose.tasks/event/
---
```
public interface Event<TArgs>
```

An event.

`TArgs`: event arguments.

 TArgs : 
## Methods

| Method | Description |
| --- | --- |
| [invoke(Object sender, TArgs args)](#invoke-java.lang.Object-TArgs-) | This method is being invoked when event is emitted. |
### invoke(Object sender, TArgs args) {#invoke-java.lang.Object-TArgs-}
```
public abstract void invoke(Object sender, TArgs args)
```


This method is being invoked when event is emitted.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sender | java.lang.Object | an object that initiates this event. |
| args | TArgs | custom arguments. |

