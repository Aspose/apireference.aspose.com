---
title: "IEventBasedModificationOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Définit les options pertinentes pour la gestion des modifications basées sur des événements lors de l'enregistrement du document."
type: docs
weight: 17
url: /fr/java/com.aspose.xps.rendering/ieventbasedmodificationoptions/
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
