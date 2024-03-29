---
title: BindPoint
second_title: Riferimento API Aspose.3D per .NET
description: ABindPoint./bindpointviene solitamente creato sulla proprietà di un oggetto alcuni tipi di proprietà contengono più campi componente come un campo Vector3 BindPoint./bindpoint genererà un canale per ciascun campo componente e collegherà il campo a una o più istanze di sequenze di fotogrammi chiave tramite i canali.
type: docs
weight: 50
url: /it/net/aspose.threed.animation/bindpoint/
---
## BindPoint class

A[`BindPoint`](../bindpoint)viene solitamente creato sulla proprietà di un oggetto, alcuni tipi di proprietà contengono più campi componente (come un campo Vector3), [`BindPoint`](../bindpoint) genererà un canale per ciascun campo componente e collegherà il campo a una o più istanze di sequenze di fotogrammi chiave tramite i canali.

```csharp
public class BindPoint : A3DObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [BindPoint](bindpoint)(Scene, Property) | Inizializza una nuova istanza di[`BindPoint`](../bindpoint) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [ChannelsCount](../../aspose.threed.animation/bindpoint/channelscount) { get; } | Ottiene il numero totale di canali di proprietà definiti in questa mappatura della curva di animazione. |
| [Item](../../aspose.threed.animation/bindpoint/item) { get; } |  |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [Property](../../aspose.threed.animation/bindpoint/property) { get; } | Ottiene la proprietà associata a CurveMapping |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddChannel](../../aspose.threed.animation/bindpoint/addchannel#addchannel)(string, object) | Aggiunge la proprietà del canale specificata. |
| [AddChannel](../../aspose.threed.animation/bindpoint/addchannel#addchannel_1)(string, Type, object) | Aggiunge la proprietà del canale specificata. |
| [AddChannel&lt;T&gt;](../../aspose.threed.animation/bindpoint/addchannel#addchannel_2)(string, T) |  |
| [BindKeyframeSequence](../../aspose.threed.animation/bindpoint/bindkeyframesequence)(string, KeyframeSequence) | Associa la sequenza di fotogrammi chiave al canale specificato |
| [CreateKeyframeSequence](../../aspose.threed.animation/bindpoint/createkeyframesequence)(string) | Crea una nuova curva e la collega al primo canale della mappatura della curva |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetChannel](../../aspose.threed.animation/bindpoint/getchannel)(string) | Ottiene il canale in base al nome |
| [GetKeyframeSequence](../../aspose.threed.animation/bindpoint/getkeyframesequence)(string) | Ottiene la prima sequenza di fotogrammi chiave nel canale specificato |
| [GetKeyframeSequences](../../aspose.threed.animation/bindpoint/getkeyframesequences)(string) | Ottiene tutte le sequenze di fotogrammi chiave nel canale specificato |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [ResetChannels](../../aspose.threed.animation/bindpoint/resetchannels)() | Svuota i canali delle proprietà di questa mappatura della curva di animazione. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |
| override [ToString](../../aspose.threed.animation/bindpoint/tostring)() | Formatta l'oggetto in string |

### Guarda anche

* class [A3DObject](../../aspose.threed/a3dobject)
* spazio dei nomi [Aspose.ThreeD.Animation](../../aspose.threed.animation)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
