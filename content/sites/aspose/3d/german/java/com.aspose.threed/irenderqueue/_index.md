---
title: IRenderQueue
second_title: Aspose.3D für Java API-Referenz
description: Der Entity-Renderer verwendet diese Warteschlange, um Renderaufgaben zu verwalten.
type: docs
weight: 248
url: /de/java/com.aspose.threed/irenderqueue/
---
```
public interface IRenderQueue
```

Der Entity-Renderer verwendet diese Warteschlange, um Renderaufgaben zu verwalten.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(RenderQueueGroupId groupId, IPipeline pipeline, Object renderableResource, int subEntity)](#add-com.aspose.threed.RenderQueueGroupId-com.aspose.threed.IPipeline-java.lang.Object-int-) | Renderaufgabe zur Renderwarteschlange hinzufügen. |
### add(RenderQueueGroupId groupId, IPipeline pipeline, Object renderableResource, int subEntity) {#add-com.aspose.threed.RenderQueueGroupId-com.aspose.threed.IPipeline-java.lang.Object-int-}
```
public abstract void add(RenderQueueGroupId groupId, IPipeline pipeline, Object renderableResource, int subEntity)
```


Renderaufgabe zur Renderwarteschlange hinzufügen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| groupId | [RenderQueueGroupId](../../com.aspose.threed/renderqueuegroupid) | In welcher Gruppe der Warteschlange die Renderaufgabe sein wird |
| pipeline | [IPipeline](../../com.aspose.threed/ipipeline) | Die Pipeline-Instanz, die für diese Renderaufgabe verwendet wird |
| renderableResource | java.lang.Object | Benutzerdefiniertes Objekt, das an [EntityRenderer](../../com.aspose.threed/entityrenderer) gesendet wird |
| subEntity | int | Der Index der Unter-Entities, nützlich, wenn das Entity aus mehr als einer renderbaren Unterkomponente besteht. |

