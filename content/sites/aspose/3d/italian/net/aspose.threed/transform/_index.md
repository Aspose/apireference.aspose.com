---
title: Transform
second_title: Riferimento API Aspose.3D per .NET
description: Una trasformazione contiene informazioni che consentono laccesso alla matrice di conversione/scala/rotazione o trasformazione delloggetto al costo minimo Viene utilizzata dalla trasformazione locale.
type: docs
weight: 2400
url: /it/net/aspose.threed/transform/
---
## Transform class

Una trasformazione contiene informazioni che consentono l'accesso alla matrice di conversione/scala/rotazione o trasformazione dell'oggetto al costo minimo Viene utilizzata dalla trasformazione locale.

```csharp
public class Transform : A3DObject
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | Ottiene o imposta la rotazione rappresentata negli angoli di Eulero, misurata in gradi |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | Ottiene o imposta la rotazione geometrica di Eulero (misurata in gradi). La trasformazione geometrica interessa solo le entità collegate e lascia inalterati i nodi figli. Verrà unita come trasformazione locale quando esporti la trasformazione geometrica in tipi di file che non la supportano. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | Ottiene o imposta la scala geometrica. La trasformazione geometrica interessa solo le entità collegate e lascia inalterati i nodi figli. Verrà unita come trasformazione locale quando esporti la trasformazione geometrica in tipi di file che non la supportano. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | Ottiene o imposta la traslazione geometrica. La trasformazione geometrica interessa solo le entità collegate e lascia inalterati i nodi figli. Verrà unita come trasformazione locale quando esporti la trasformazione geometrica in tipi di file che non la supportano. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | Ottiene o imposta la post-rotazione rappresentata in gradi |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | Ottiene o imposta la pre-rotazione rappresentata in gradi |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | Ottiene o imposta la rotazione rappresentata in quaternione. |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | Ottiene o imposta la scala |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | Ottiene o imposta la matrice di trasformazione. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | Ottiene o imposta la traduzione |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | Imposta gli angoli di Eulero in gradi di trasformazione corrente. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | Imposta la rotazione geometrica di Eulero (misurata in gradi). La trasformazione geometrica interessa solo le entità collegate e lascia inalterati i nodi figli. Verrà unita come trasformazione locale quando esporti la trasformazione geometrica in tipi di file che non la supportano. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | Imposta la scala geometrica. La trasformazione geometrica interessa solo le entità collegate e lascia inalterati i nodi figli. Verrà unita come trasformazione locale quando esporti la trasformazione geometrica in tipi di file che non la supportano. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | Imposta la traslazione geometrica. La trasformazione geometrica interessa solo le entità collegate e lascia inalterati i nodi figli. Verrà unita come trasformazione locale quando esporti la trasformazione geometrica in tipi di file che non la supportano. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | Imposta la post-rotazione rappresentata in gradi |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | Imposta la pre-rotazione rappresentata in gradi |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | Imposta la rotazione (come componenti del quaternione) della trasformazione corrente. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | Imposta la scala della trasformazione corrente. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | Imposta la traduzione della trasformazione corrente. |

### Guarda anche

* class [A3DObject](../a3dobject)
* spazio dei nomi [Aspose.ThreeD](../../aspose.threed)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
