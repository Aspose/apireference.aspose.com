---
title: Add
second_title: Aspose.Tasks voor .NET API-referentie
description: Retourneert een exemplaar van FinishStartTaskLinkaspose.tasks/tasklink/ die is toegevoegd aan het TaskLinkCollectionobject.
type: docs
weight: 40
url: /nl/net/aspose.tasks/tasklinkcollection/add/
---
## Add(Task, Task) {#add}

Retourneert een exemplaar van Finish-Start[`TaskLink`](../../tasklink/) die is toegevoegd aan het TaskLinkCollection-object.

```csharp
public TaskLink Add(Task pred, Task succ)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pred | Task | Voorganger taak. |
| succ | Task | Opvolger taak. |

### Winstwaarde

een taakkoppelingsinstantie die aan dit object is toegevoegd.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Als een van de invoertaken gelijk is aan null, danArgumentNullException zal worden gegooid. |

### Zie ook

* class [TaskLink](../../tasklink/)
* class [Task](../../task/)
* class [TaskLinkCollection](../)
* naamruimte [Aspose.Tasks](../../tasklinkcollection/)
* montage [Aspose.Tasks](../../../)

---

## Add(Task, Task, TaskLinkType) {#add_1}

Retourneert een exemplaar van[`TaskLink`](../../tasklink/) die is toegevoegd aan het TaskLinkCollection-object.

```csharp
public TaskLink Add(Task pred, Task succ, TaskLinkType linkType)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pred | Task | Voorganger taak. |
| succ | Task | Opvolger taak. |
| linkType | TaskLinkType | Koppelingstype[`TaskLinkType`](../../tasklinktype/) |

### Winstwaarde

een taakkoppelingsinstantie die aan dit object is toegevoegd.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Als een van de invoertaken gelijk is aan null, danArgumentNullException zal worden gegooid. |

### Zie ook

* class [TaskLink](../../tasklink/)
* class [Task](../../task/)
* enum [TaskLinkType](../../tasklinktype/)
* class [TaskLinkCollection](../)
* naamruimte [Aspose.Tasks](../../tasklinkcollection/)
* montage [Aspose.Tasks](../../../)

---

## Add(Task, Task, TaskLinkType, Duration) {#add_2}

Retourneert een exemplaar van[`TaskLink`](../../tasklink/) die is toegevoegd aan het TaskLinkCollection-object.

```csharp
public TaskLink Add(Task pred, Task succ, TaskLinkType linkType, Duration lag)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pred | Task | Voorganger taak. |
| succ | Task | Opvolger taak. |
| linkType | TaskLinkType | Koppelingstype[`TaskLinkType`](../../tasklinktype/) |
| lag | Duration | Link vertraging[`Duration`](../../duration/). |

### Winstwaarde

een taakkoppeling die aan dit object is toegevoegd.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Als een van de invoertaken gelijk is aan null, danArgumentNullException zal worden gegooid. |

### Zie ook

* class [TaskLink](../../tasklink/)
* class [Task](../../task/)
* enum [TaskLinkType](../../tasklinktype/)
* struct [Duration](../../duration/)
* class [TaskLinkCollection](../)
* naamruimte [Aspose.Tasks](../../tasklinkcollection/)
* montage [Aspose.Tasks](../../../)

---

## Add(TaskLink) {#add_3}

Dit is de stub-implementatie van ICollection's Add-methode, die alleen NotSupportedException genereert

```csharp
public void Add(TaskLink item)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| item | TaskLink | Het item dat moet worden toegevoegd. |

### Zie ook

* class [TaskLink](../../tasklink/)
* class [TaskLinkCollection](../)
* naamruimte [Aspose.Tasks](../../tasklinkcollection/)
* montage [Aspose.Tasks](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Tasks.dll -->
