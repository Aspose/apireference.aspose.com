---
title: IRenderQueue
second_title: Aspose.3D for Java API Reference
description: Entity renderer uses this queue to manage render tasks.
type: docs
weight: 231
url: /java/com.aspose.threed/irenderqueue/
---
```
public interface IRenderQueue
```

Entity renderer uses this queue to manage render tasks.
## Methods

| Method | Description |
| --- | --- |
| [add(RenderQueueGroupId groupId, IPipeline pipeline, Object renderableResource, int subEntity)](#add-com.aspose.threed.RenderQueueGroupId-com.aspose.threed.IPipeline-java.lang.Object-int-) | Add render task to the render queue. |
### add(RenderQueueGroupId groupId, IPipeline pipeline, Object renderableResource, int subEntity) {#add-com.aspose.threed.RenderQueueGroupId-com.aspose.threed.IPipeline-java.lang.Object-int-}
```
public abstract void add(RenderQueueGroupId groupId, IPipeline pipeline, Object renderableResource, int subEntity)
```


Add render task to the render queue.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| groupId | [RenderQueueGroupId](../../com.aspose.threed/renderqueuegroupid) | Which group of the queue the render task will be in |
| pipeline | [IPipeline](../../com.aspose.threed/ipipeline) | The pipeline instance used for this render task |
| renderableResource | java.lang.Object | Custom object that will be sent to [EntityRenderer](../../com.aspose.threed/entityrenderer) |
| subEntity | int | The index of sub entities, useful when the entity is consisting of more than one sub renderable components. |

