---
title: "IEventBasedModificationOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Definierar alternativ som är relevanta för hantering av händelsebaserade ändringar under dokumentlagring."
type: docs
weight: 17
url: /sv/java/com.aspose.xps.rendering/ieventbasedmodificationoptions/
---```
public interface IEventBasedModificationOptions
```

Defines options relevant to handling event-based modifications during document saving.
## Methods

| Method | Description |
| --- | --- |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Returns the collection of event handlers that performs modifications to an XPS page just before it is saved. |
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public abstract List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Returns the collection of event handlers that performs modifications to an XPS page just before it is saved.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - The collection of event handlers that performs modifications to an XPS page just before it is saved.
