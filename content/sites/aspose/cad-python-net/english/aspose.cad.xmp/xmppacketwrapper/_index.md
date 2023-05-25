---
title: XmpPacketWrapper class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 110
url: /aspose.cad.xmp/xmppacketwrapper/
is_root: false
---

## XmpPacketWrapper class

Contains serialized xmp package including header and trailer.



The XmpPacketWrapper type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/__init__/#aspose.cad.xmp.XmpHeaderPi-aspose.cad.xmp.XmpTrailerPi-aspose.cad.xmp.XmpMeta) | Initializes a new instance of the [`XmpPacketWrapper`](/cad/python-net/aspose.cad.xmp/xmppacketwrapper) class. |
| [__init__](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/__init__/#) | Initializes a new instance of the [`XmpPacketWrapper`](/cad/python-net/aspose.cad.xmp/xmppacketwrapper) class. |


### Properties
| Property | Description |
| :- | :- |
| [header_pi](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/header_pi) | Gets the header processing instruction. |
| [meta](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/meta) | Gets the XMP meta. Optional. |
| [trailer_pi](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/trailer_pi) | Gets the trailer processing instruction. |
| [packages](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/packages) | Gets array of [`XmpPackage`](/cad/python-net/aspose.cad.xmp/xmppackage) inside XMP. |
| [packages_count](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/packages_count) | Gets amount of packages inside XMP structure. |


### Methods
| Method | Description |
| :- | :- |
| [add_package](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/add_package/#aspose.cad.xmp.XmpPackage) | Adds the package. |
| [get_package](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/get_package/#str) | Gets package by namespace URI. |
| [contains_package](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/contains_package/#str) | Determines whethere package is exist in xmp wrapper. |
| [remove_package](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/remove_package/#aspose.cad.xmp.XmpPackage) | Removes the XMP package. |
| [clear_packages](/cad/python-net/aspose.cad.xmp/xmppacketwrapper/clear_packages/#) | Removes all [`XmpPackage`](/cad/python-net/aspose.cad.xmp/xmppackage) inside XMP. |



### Remarks 


A wrapper consisting of a pair of XML processing instructions (PIs) may be placed around the rdf:RDF element.

### See Also
* module [`aspose.cad.xmp`](..)
* class [`XmpPackage`](/cad/python-net/aspose.cad.xmp/xmppackage)
* class [`XmpPacketWrapper`](/cad/python-net/aspose.cad.xmp/xmppacketwrapper)
