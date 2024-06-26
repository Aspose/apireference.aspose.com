---
title: GlobalLayoutSlideCollection
second_title: Aspose.Slides für .NET-API-Referenz
description: Repräsentiert eine Sammlung aller LayoutFolien in der Präsentation. Erweitert die LayoutSlideCollectionKlasse um Methoden zum Hinzufügen/Klonen von LayoutFolien im Zusammenhang mit der Vereinigung der einzelnen Sammlungen von MasterLayoutFolien.
type: docs
weight: 4550
url: /de/net/aspose.slides/globallayoutslidecollection/
---
## GlobalLayoutSlideCollection class

Repräsentiert eine Sammlung aller Layout-Folien in der Präsentation. Erweitert die LayoutSlideCollection-Klasse um Methoden zum Hinzufügen/Klonen von -Layout-Folien im Zusammenhang mit der Vereinigung der einzelnen Sammlungen von Master-Layout-Folien.

```csharp
public sealed class GlobalLayoutSlideCollection : LayoutSlideCollection, 
    IGlobalLayoutSlideCollection
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Count](../../aspose.slides/layoutslidecollection/count) { get; } | Gibt die Anzahl der Layoutfolien in einer Sammlung zurück. SchreibgeschütztInt32 . |
| [IsSynchronized](../../aspose.slides/layoutslidecollection/issynchronized) { get; } | Gibt einen Wert zurück, der angibt, ob der Zugriff auf die Sammlung synchronisiert (threadsicher) ist. SchreibgeschütztBoolean . |
| [Item](../../aspose.slides/layoutslidecollection/item) { get; } | Gibt die Layoutfolie nach Index zurück. Schreibgeschützt[`LayoutSlide`](../layoutslide) . |
| [SyncRoot](../../aspose.slides/layoutslidecollection/syncroot) { get; } | Gibt einen Synchronisationsstamm zurück. SchreibgeschütztObject . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.slides/globallayoutslidecollection/add)(IMasterSlide, SlideLayoutType, string) | Fügt der Präsentation eine neue Layoutfolie hinzu. |
| [AddClone](../../aspose.slides/globallayoutslidecollection/addclone#addclone)(ILayoutSlide) | Fügt der Präsentation eine Kopie einer bestimmten Layoutfolie hinzu. |
| [AddClone](../../aspose.slides/globallayoutslidecollection/addclone#addclone_1)(ILayoutSlide, IMasterSlide) | Fügt der Präsentation eine Kopie einer bestimmten Layoutfolie hinzu. |
| [CopyTo](../../aspose.slides/layoutslidecollection/copyto)(Array, int) | Kopiert alle Elemente aus der Sammlung in das angegebene Array. |
| [GetByType](../../aspose.slides/layoutslidecollection/getbytype)(SlideLayoutType) | Gibt die erste Layoutfolie des angegebenen Typs zurück. Eine Art Layoutfolie, die gesucht werden soll.[`LayoutSlide`](../layoutslide) mit angegebenem Typ oder null, wenn keine Layouts gefunden werden. |
| [GetEnumerator](../../aspose.slides/layoutslidecollection/getenumerator)() | Gibt einen Enumerator zurück, der die Sammlung durchläuft. |
| [Remove](../../aspose.slides/layoutslidecollection/remove)(ILayoutSlide) | Entfernt ein Layout aus der Sammlung. |
| [RemoveUnused](../../aspose.slides/layoutslidecollection/removeunused)() | Entfernt nicht verwendete Layoutfolien (Layoutfolien, deren HasDependingSlides falsch ist). |

### Siehe auch

* class [LayoutSlideCollection](../layoutslidecollection)
* interface [IGlobalLayoutSlideCollection](../igloballayoutslidecollection)
* namensraum [Aspose.Slides](../../aspose.slides)
* Montage [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
