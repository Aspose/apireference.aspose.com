---
title: EntityRenderer
second_title: Aspose.3D für Java API-Referenz
description: Erben Sie davon, um das Rendering für verschiedene Arten von Entitäten zu implementieren.
type: docs
weight: 53
url: /de/java/com.aspose.threed/entityrenderer/
---

**Inheritance:**
java.lang.Object
```
public class EntityRenderer
```

Erben Sie davon, um das Rendering für verschiedene Arten von Entitäten zu implementieren.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [EntityRenderer(String key, byte features)](#EntityRenderer-java.lang.String-byte-) | Konstruktor von [EntityRenderer](../../com.aspose.threed/entityrenderer) |
| [EntityRenderer(String key)](#EntityRenderer-java.lang.String-) | Konstruktor von [EntityRenderer](../../com.aspose.threed/entityrenderer) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [dispose()](#dispose--) | Der EntityRenderer wird entsorgt, gemeinsame Ressourcen freigegeben. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [frameBegin(Renderer renderer, IRenderQueue renderQueue)](#frameBegin-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-) | Beginne das Rendern eines Frames |
| [frameEnd(Renderer renderer, IRenderQueue renderQueue)](#frameEnd-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-) | Beendet das Rendern eines Frames |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [initialize(Renderer renderer)](#initialize-com.aspose.threed.Renderer-) | Initialisiere den EntityRenderer |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [prepareRenderQueue(Renderer renderer, IRenderQueue queue, Node node, Entity entity)](#prepareRenderQueue-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-com.aspose.threed.Node-com.aspose.threed.Entity-) | Bereite Renderbefehle für das angegebene Knoten/Entity-Paar vor. |
| [renderEntity(Renderer renderer, ICommandList commandList, Node node, Object renderableResource, int subEntity)](#renderEntity-com.aspose.threed.Renderer-com.aspose.threed.ICommandList-com.aspose.threed.Node-java.lang.Object-int-) | Jede Renderaufgabe, die in die [IRenderQueue](../../com.aspose.threed/irenderqueue) geschoben wird, hat einen entsprechenden RenderEntity-Aufruf, um den konkreten Rendering-Job auszuführen. |
| [resetSceneCache()](#resetSceneCache--) | Die Szene wurde geändert oder entfernt, szenenbezogene Renderressourcen müssen freigegeben werden. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EntityRenderer(String key, byte features) {#EntityRenderer-java.lang.String-byte-}
```
public EntityRenderer(String key, byte features)
```


Konstruktor von [EntityRenderer](../../com.aspose.threed/entityrenderer)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schlüssel | java.lang.String | Der Schlüssel des Entity-Renderers |
| Funktionen | Byte | Die zusätzlichen Funktionen des Entity-Renderers |

### EntityRenderer(String key) {#EntityRenderer-java.lang.String-}
```
public EntityRenderer(String key)
```


Konstruktor von [EntityRenderer](../../com.aspose.threed/entityrenderer)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schlüssel | java.lang.String | Der Schlüssel des Entity-Renderers |

### dispose() {#dispose--}
```
public void dispose()
```


Der EntityRenderer wird entsorgt, gemeinsame Ressourcen freigegeben.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### frameBegin(Renderer renderer, IRenderQueue renderQueue) {#frameBegin-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-}
```
public void frameBegin(Renderer renderer, IRenderQueue renderQueue)
```


Beginne das Rendern eines Frames

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | Aktueller Renderer |
| renderQueue | [IRenderQueue](../../com.aspose.threed/irenderqueue) | Renderwarteschlange |

### frameEnd(Renderer renderer, IRenderQueue renderQueue) {#frameEnd-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-}
```
public void frameEnd(Renderer renderer, IRenderQueue renderQueue)
```


Beendet das Rendern eines Frames

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | Aktueller Renderer |
| renderQueue | [IRenderQueue](../../com.aspose.threed/irenderqueue) | Renderwarteschlange |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initialize(Renderer renderer) {#initialize-com.aspose.threed.Renderer-}
```
public void initialize(Renderer renderer)
```


Initialisiere den EntityRenderer

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) |  |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### prepareRenderQueue(Renderer renderer, IRenderQueue queue, Node node, Entity entity) {#prepareRenderQueue-com.aspose.threed.Renderer-com.aspose.threed.IRenderQueue-com.aspose.threed.Node-com.aspose.threed.Entity-}
```
public void prepareRenderQueue(Renderer renderer, IRenderQueue queue, Node node, Entity entity)
```


Bereite Renderbefehle für das angegebene Knoten/Entity-Paar vor.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | Die aktuelle Renderer-Instanz |
| queue | [IRenderQueue](../../com.aspose.threed/irenderqueue) | Die Renderwarteschlange, die zur Verwaltung von Renderaufgaben verwendet wird |
| node | [Node](../../com.aspose.threed/node) | Aktueller Knoten |
| entity | [Entity](../../com.aspose.threed/entity) | Das Entity, das gerendert werden muss |

### renderEntity(Renderer renderer, ICommandList commandList, Node node, Object renderableResource, int subEntity) {#renderEntity-com.aspose.threed.Renderer-com.aspose.threed.ICommandList-com.aspose.threed.Node-java.lang.Object-int-}
```
public void renderEntity(Renderer renderer, ICommandList commandList, Node node, Object renderableResource, int subEntity)
```


Jede Renderaufgabe, die in die [IRenderQueue](../../com.aspose.threed/irenderqueue) geschoben wird, hat einen entsprechenden RenderEntity-Aufruf, um den konkreten Rendering-Job auszuführen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| renderer | [Renderer](../../com.aspose.threed/renderer) | Der Renderer |
| commandList | [ICommandList](../../com.aspose.threed/icommandlist) | Die commandList, die zum Aufzeichnen der Rendering-Befehle verwendet wird |
| node | [Node](../../com.aspose.threed/node) | Der gleiche Knoten, der an PrepareRenderQueue des zu rendernden Entity übergeben wurde |
| renderableResource | java.lang.Object | Das benutzerdefinierte Objekt, das während der PrepareRenderQueue an IRenderQueue übergeben wurde |
| subEntity | int | Der Index des Sub-Entity, das an IRenderQueue übergeben wurde |

### resetSceneCache() {#resetSceneCache--}
```
public void resetSceneCache()
```


Die Szene wurde geändert oder entfernt, szenenbezogene Renderressourcen müssen freigegeben werden.

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

