---
title: "IEventBasedModificationOptions"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Ορίζει επιλογές σχετικές με τη διαχείριση τροποποιήσεων βάσει συμβάντων κατά την αποθήκευση του εγγράφου."
type: docs
weight: 17
url: /el/java/com.aspose.xps.rendering/ieventbasedmodificationoptions/
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
