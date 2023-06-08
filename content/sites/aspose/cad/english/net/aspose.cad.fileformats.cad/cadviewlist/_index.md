---
title: Class CadViewList
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Cad.CadViewList class. The cad view dictionary The following group codes apply to VPORT symbol table entries. The VPORT table is unique it may contain several entries with the same name indicating a multipleviewport configuration. The entries corresponding to the active viewport configuration all have the name ACTIVE. The first such entry describes the current viewport. Since the name is not unique we use List as a container
type: docs
weight: 4080
url: /net/aspose.cad.fileformats.cad/cadviewlist/
---
## CadViewList class

The cad view dictionary The following group codes apply to VPORT symbol table entries. The VPORT table is unique: it may contain several entries with the same name (indicating a multiple-viewport configuration). The entries corresponding to the active viewport configuration all have the name *ACTIVE. The first such entry describes the current viewport. Since the name is not unique, we use List as a container

```csharp
public class CadViewList : NonGenericList, ICloneable
```

## Constructors

| Name | Description |
| --- | --- |
| [CadViewList](cadviewlist/)() | Initializes a new instance of the `CadViewList` class. |

## Properties

| Name | Description |
| --- | --- |
| [CadSymbolTableGroupCodes](../../aspose.cad.fileformats.cad/cadviewlist/cadsymboltablegroupcodes/) { get; set; } | Gets or sets the cad symbol table group codes. |
| [Count](../../aspose.cad/nongenericlist/count/) { get; } | Gets the number of elements contained in the ICollection. |
| [IsFixedSize](../../aspose.cad/nongenericlist/isfixedsize/) { get; } | Gets a value indicating whether the IList has a fixed size. |
| [IsReadOnly](../../aspose.cad/nongenericlist/isreadonly/) { get; } | Gets a value indicating whether the IList is read-only. |
| [IsSynchronized](../../aspose.cad/nongenericlist/issynchronized/) { get; } | Gets a value indicating whether access to the ICollection is synchronized (thread safe). |
| [Item](../../aspose.cad/nongenericlist/item/) { get; set; } | Gets or sets the element at the specified index. |
| [SyncRoot](../../aspose.cad/nongenericlist/syncroot/) { get; } | Gets an object that can be used to synchronize access to the ICollection. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.cad/nongenericlist/add/)(object) | Adds an item to the IList. |
| [AddRange](../../aspose.cad.fileformats.cad/cadviewlist/addrange/)(CadViewTableObject[]) | Adds the range of the objects to container. |
| [Clear](../../aspose.cad/nongenericlist/clear/)() | Removes all items from the IList. |
| [Clone](../../aspose.cad.fileformats.cad/cadviewlist/clone/)() | The clone. |
| [Contains](../../aspose.cad/nongenericlist/contains/)(object) | Determines whether the IList contains a specific value. |
| [CopyTo](../../aspose.cad/nongenericlist/copyto/)(Array, int) | Copies the elements of the ICollection to an Array, starting at a particular Array index. |
| [GetEnumerator](../../aspose.cad/nongenericlist/getenumerator/)() | Returns an enumerator that iterates through a collection. |
| [IndexOf](../../aspose.cad/nongenericlist/indexof/)(object) | Determines the index of a specific item in the IList. |
| [Insert](../../aspose.cad/nongenericlist/insert/)(int, object) | Inserts an item to the IList at the specified index. |
| [Remove](../../aspose.cad/nongenericlist/remove/)(object) | Removes the first occurrence of a specific object from the IList. |
| [RemoveAt](../../aspose.cad/nongenericlist/removeat/)(int) | Removes the IList item at the specified index. |

### See Also

* class [NonGenericList](../../aspose.cad/nongenericlist/)
* namespace [Aspose.CAD.FileFormats.Cad](../../aspose.cad.fileformats.cad/)
* assembly [Aspose.CAD](../../)


