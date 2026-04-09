---
title: ICommandList
second_title: Aspose.3D für Java API-Referenz
description: Kodiert eine Sequenz von Befehlen, die an die GPU zum Rendern gesendet werden.
type: docs
weight: 240
url: /de/java/com.aspose.threed/icommandlist/
---
```
public interface ICommandList
```

Kodiert eine Sequenz von Befehlen, die an die GPU zum Rendern gesendet werden.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [bindDescriptorSet(IDescriptorSet descriptorSet)](#bindDescriptorSet-com.aspose.threed.IDescriptorSet-) | Binde das Deskriptorset an die aktuelle Pipeline |
| [bindIndexBuffer(IIndexBuffer indexBuffer)](#bindIndexBuffer-com.aspose.threed.IIndexBuffer-) | Binde den Indexpuffer für das Rendering |
| [bindPipeline(IPipeline pipeline)](#bindPipeline-com.aspose.threed.IPipeline-) | Binde die Pipeline-Instanz für das Rendering |
| [bindVertexBuffer(IVertexBuffer vertexBuffer)](#bindVertexBuffer-com.aspose.threed.IVertexBuffer-) | Binde den Vertex-Puffer für das Rendering |
| [draw()](#draw--) | Zeichnen ohne Indexpuffer |
| [draw(int start, int count)](#draw-int-int-) | Zeichnen ohne Indexpuffer |
| [drawIndex()](#drawIndex--) | Führe einen indizierten Zeichenvorgang in eine Befehlsliste aus |
| [drawIndex(int start, int count)](#drawIndex-int-int-) | Führe einen indizierten Zeichenvorgang in eine Befehlsliste aus |
| [pushConstants(int stage, byte[] data)](#pushConstants-int-byte---) | Schiebe die Konstante in die Pipeline |
| [pushConstants(int stage, byte[] data, int size)](#pushConstants-int-byte---int-) | Schiebe die Konstante in die Pipeline |
### bindDescriptorSet(IDescriptorSet descriptorSet) {#bindDescriptorSet-com.aspose.threed.IDescriptorSet-}
```
public abstract void bindDescriptorSet(IDescriptorSet descriptorSet)
```


Binde das Deskriptorset an die aktuelle Pipeline

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| descriptorSet | [IDescriptorSet](../../com.aspose.threed/idescriptorset) |  |

### bindIndexBuffer(IIndexBuffer indexBuffer) {#bindIndexBuffer-com.aspose.threed.IIndexBuffer-}
```
public abstract void bindIndexBuffer(IIndexBuffer indexBuffer)
```


Binde den Indexpuffer für das Rendering

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| indexBuffer | [IIndexBuffer](../../com.aspose.threed/iindexbuffer) |  |

### bindPipeline(IPipeline pipeline) {#bindPipeline-com.aspose.threed.IPipeline-}
```
public abstract void bindPipeline(IPipeline pipeline)
```


Binde die Pipeline-Instanz für das Rendering

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pipeline | [IPipeline](../../com.aspose.threed/ipipeline) |  |

### bindVertexBuffer(IVertexBuffer vertexBuffer) {#bindVertexBuffer-com.aspose.threed.IVertexBuffer-}
```
public abstract void bindVertexBuffer(IVertexBuffer vertexBuffer)
```


Binde den Vertex-Puffer für das Rendering

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| vertexBuffer | [IVertexBuffer](../../com.aspose.threed/ivertexbuffer) |  |

### draw() {#draw--}
```
public abstract void draw()
```


Zeichnen ohne Indexpuffer

### draw(int start, int count) {#draw-int-int-}
```
public abstract void draw(int start, int count)
```


Zeichnen ohne Indexpuffer

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Start | int |  |
| Anzahl | int |  |

### drawIndex() {#drawIndex--}
```
public abstract void drawIndex()
```


Führe einen indizierten Zeichenvorgang in eine Befehlsliste aus

### drawIndex(int start, int count) {#drawIndex-int-int-}
```
public abstract void drawIndex(int start, int count)
```


Führe einen indizierten Zeichenvorgang in eine Befehlsliste aus

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Start | int | Der erste Index zum Zeichnen |
| Anzahl | int | Die Anzahl der zu zeichnenden Indizes |

### pushConstants(int stage, byte[] data) {#pushConstants-int-byte---}
```
public abstract void pushConstants(int stage, byte[] data)
```


Schiebe die Konstante in die Pipeline

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stufe | int | Welche Shader‑Stufe die Konstantendaten verbraucht |
| Daten | byte[] | Die Daten, die an den Shader gesendet werden |

### pushConstants(int stage, byte[] data, int size) {#pushConstants-int-byte---int-}
```
public abstract void pushConstants(int stage, byte[] data, int size)
```


Schiebe die Konstante in die Pipeline

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stufe | int | Welche Shader‑Stufe die Konstantendaten verbraucht |
| Daten | byte[] | Die Daten, die an den Shader gesendet werden |
| Größe | int | Bytes, die in die Pipeline geschrieben werden |

