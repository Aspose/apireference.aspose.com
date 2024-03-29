---
title: EmfModifyWorldTransformMode
second_title: Aspose.Imaging für .NET-API-Referenz
description: Die ModifyWorldTransformMode-Enumeration definiert Modi für die Verwendung der angegebenen Transformationsdaten  um die World-Space-to-Page-Space-Transformation zu ändern die derzeit im Kontext des Wiedergabegeräts definiert ist.
type: docs
weight: 2770
url: /de/net/aspose.imaging.fileformats.emf.emf.consts/emfmodifyworldtransformmode/
---
## EmfModifyWorldTransformMode enumeration

Die ModifyWorldTransformMode-Enumeration definiert Modi für die Verwendung der angegebenen Transformationsdaten , um die World-Space-to-Page-Space-Transformation zu ändern, die derzeit im Kontext des Wiedergabegeräts definiert ist.

```csharp
public enum EmfModifyWorldTransformMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| MWT_IDENTITY | `1` | Setzt die aktuelle Transformation unter Verwendung der Identitätsmatrix zurück. In diesem Modus werden die angegebenen Transformationsdaten ignoriert |
| MWT_LEFTMULTIPLY | `2` | Multiplizieren Sie die aktuelle Transformation. In diesem Modus sind die angegebenen Transformationsdaten der linke Multiplikand, und die aktuell im Kontext des Wiedergabegeräts definierte Transformation ist der rechte Multiplikand |
| MWT_RIGHTMULTIPLY | `3` | Multiplizieren Sie die aktuelle Transformation. In diesem Modus sind die angegebenen Transformationsdaten der rechte Multiplikand, , und die aktuell im Kontext des Wiedergabegeräts definierte Transformation ist der linke Multiplikand . |
| MWT_SET | `4` | Führt die Funktion eines EMR_SETWORLDTRANSFORM-Datensatzes aus (Abschnitt 2.3.12.2). |

### Siehe auch

* namensraum [Aspose.Imaging.FileFormats.Emf.Emf.Consts](../../aspose.imaging.fileformats.emf.emf.consts)
* Montage [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
