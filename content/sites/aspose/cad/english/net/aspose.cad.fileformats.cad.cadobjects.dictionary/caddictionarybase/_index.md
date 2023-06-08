---
title: Class CadDictionaryBase
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Cad.CadObjects.Dictionary.CadDictionaryBase class. Class describing DICTIONARY base object
type: docs
weight: 3300
url: /net/aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/
---
## CadDictionaryBase class

Class describing DICTIONARY base object.

```csharp
public abstract class CadDictionaryBase : CadBaseObject
```

## Constructors

| Name | Description |
| --- | --- |
| [CadDictionaryBase](caddictionarybase/)() | Initializes a new instance of the `CadDictionaryBase` class. |

## Properties

| Name | Description |
| --- | --- |
| [ApplicationCodesContainer](../../aspose.cad.fileformats.cad.cadobjects/cadbase/applicationcodescontainer/) { get; set; } | Gets or sets the application defined codes container. |
| [Attribute102Values](../../aspose.cad.fileformats.cad.cadobjects/cadbase/attribute102values/) { get; set; } | Gets or sets the attribute102 values. |
| [Attributes](../../aspose.cad.fileformats.cad.cadobjects/cadbase/attributes/) { get; set; } | Gets or sets the attributes. |
| [ChildObjects](../../aspose.cad.fileformats.cad.cadobjects/cadbaseobject/childobjects/) { get; set; } | Gets or sets the child objects. |
| [CloningFlag](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/cloningflag/) { get; set; } | Gets or sets cloning flag. |
| [EmbeddedObjectsContainer](../../aspose.cad.fileformats.cad.cadobjects/cadbase/embeddedobjectscontainer/) { get; set; } | Gets or sets the embedded objects container. |
| [EntryNames](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/entrynames/) { get; set; } | Gets or sets names of entries. |
| [EntrySoftOwners](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/entrysoftowners/) { get; set; } | Gets or sets the entry soft owners. |
| [HardOwner](../../aspose.cad.fileformats.cad.cadobjects/cadbaseowned/hardowner/) { get; set; } | Gets or sets the hard owner. |
| [HardOwnerFlag](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/hardownerflag/) { get; set; } | Gets or sets hard owner flag. |
| [IsSoftOwnerSet](../../aspose.cad.fileformats.cad.cadobjects/cadbaseowned/issoftownerset/) { get; } | Gets a value indicating whether soft owner is set. |
| [Item](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/item/) { get; } | Gets or sets the entry soft owner by key. |
| [Numreactors](../../aspose.cad.fileformats.cad.cadobjects/cadbaseowned/numreactors/) { get; set; } | The Numreactors |
| [ObjectHandle](../../aspose.cad.fileformats.cad.cadobjects/cadbase/objecthandle/) { get; set; } | Gets or sets the object handle. |
| [Reactors](../../aspose.cad.fileformats.cad.cadobjects/cadbaseowned/reactors/) { get; set; } | Get or sets the reactors handle |
| [SoftOwner](../../aspose.cad.fileformats.cad.cadobjects/cadbaseowned/softowner/) { get; set; } | Gets or sets the soft owner. |
| [TypeName](../../aspose.cad.fileformats.cad.cadobjects/cadbaseobject/typename/) { get; } | Gets the name of the type. |
| [XdataContainer](../../aspose.cad.fileformats.cad.cadobjects/cadbase/xdatacontainer/) { get; set; } | Gets or sets the xdata container. |

## Methods

| Name | Description |
| --- | --- |
| [GetUID](../../aspose.cad.fileformats.cad.cadobjects/cadbase/getuid/)() | Identifier to use if object handle doesn't work. Done as method not to disturb FileComparer's property comparer |
| [RemoveByValue](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/removebyvalue/)(string) | Removes the entry soft owner and entry name by value. |
| [SetUID](../../aspose.cad.fileformats.cad.cadobjects/cadbase/setuid/)(string) | Sets |
| [TryGetValue](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/trygetvalue/#trygetvalue_1)(string, out string) | Gets the entry soft owner by key. |
| [TryGetValue](../../aspose.cad.fileformats.cad.cadobjects.dictionary/caddictionarybase/trygetvalue/#trygetvalue)(string, out CadEntityAttribute, out string) | Gets the entry soft owner by key. |

### See Also

* class [CadBaseObject](../../aspose.cad.fileformats.cad.cadobjects/cadbaseobject/)
* namespace [Aspose.CAD.FileFormats.Cad.CadObjects.Dictionary](../../aspose.cad.fileformats.cad.cadobjects.dictionary/)
* assembly [Aspose.CAD](../../)


