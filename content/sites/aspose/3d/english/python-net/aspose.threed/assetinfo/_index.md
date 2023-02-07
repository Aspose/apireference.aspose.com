---
title: AssetInfo class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed/assetinfo/
is_root: false
---

## AssetInfo class

Information of asset.
Asset information can be attached to a [Scene](/3d/python-net/aspose.threed/scene).
Child [Scene](/3d/python-net/aspose.threed/scene) can have its own [AssetInfo](/3d/python-net/aspose.threed/assetinfo) to override parent's definition.



**Inheritance:** [AssetInfo](/3d/python-net/aspose.threed/assetinfo) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The AssetInfo type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [AssetInfo()](/3d/python-net/aspose.threed/assetinfo/__init__/#) | Initializes a new instance of the [AssetInfo](/3d/python-net/aspose.threed/assetinfo) class. |
| [AssetInfo(name)](/3d/python-net/aspose.threed/assetinfo/__init__/#str) | Initializes a new instance of the [AssetInfo](/3d/python-net/aspose.threed/assetinfo) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed/assetinfo/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed/assetinfo/properties) | Gets the collection of all properties. |
| [creation_time](/3d/python-net/aspose.threed/assetinfo/creation_time) | Gets or Sets the creation time of this asset |
| [modification_time](/3d/python-net/aspose.threed/assetinfo/modification_time) | Gets or Sets the modification time of this asset |
| [ambient](/3d/python-net/aspose.threed/assetinfo/ambient) | Gets or Sets the default ambient color of this asset |
| [url](/3d/python-net/aspose.threed/assetinfo/url) | Gets or Sets the URL of this asset. |
| [application_vendor](/3d/python-net/aspose.threed/assetinfo/application_vendor) | Gets or sets the application vendor's name |
| [copyright](/3d/python-net/aspose.threed/assetinfo/copyright) | Gets or sets the document's copyright |
| [application_name](/3d/python-net/aspose.threed/assetinfo/application_name) | Gets or sets the application that created this asset |
| [application_version](/3d/python-net/aspose.threed/assetinfo/application_version) | Gets or sets the version of the application that created this asset. |
| [title](/3d/python-net/aspose.threed/assetinfo/title) | Gets or sets the title of this asset |
| [subject](/3d/python-net/aspose.threed/assetinfo/subject) | Gets or sets the subject of this asset |
| [author](/3d/python-net/aspose.threed/assetinfo/author) | Gets or sets the author of this asset |
| [keywords](/3d/python-net/aspose.threed/assetinfo/keywords) | Gets or sets the keywords of this asset |
| [revision](/3d/python-net/aspose.threed/assetinfo/revision) | Gets or sets the revision number of this asset, usually used in version control system. |
| [comment](/3d/python-net/aspose.threed/assetinfo/comment) | Gets or sets the comment of this asset. |
| [unit_name](/3d/python-net/aspose.threed/assetinfo/unit_name) | Gets or sets the unit of length used in this asset.<br/>e.g. cm/m/km/inch/feet |
| [unit_scale_factor](/3d/python-net/aspose.threed/assetinfo/unit_scale_factor) | Gets or sets the scale factor to real-world meter. |
| [coordinated_system](/3d/python-net/aspose.threed/assetinfo/coordinated_system) | Gets or sets the coordinate system used in this asset. |
| [up_vector](/3d/python-net/aspose.threed/assetinfo/up_vector) | Gets or sets the up-vector used in this asset. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed/assetinfo/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed/assetinfo/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed/assetinfo/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed/assetinfo/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed/assetinfo/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |



### Example 


The following code shows how to read asset info from a fbx file:

```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
print(f"The file is created at {scene.asset_info.creation_time} by {scene.asset_info.application_name} {scene.asset_info.application_version} ")

```

### See Also
* module [aspose.threed](..)
* class [A3DObject](/3d/python-net/aspose.threed/a3dobject)
* class [AssetInfo](/3d/python-net/aspose.threed/assetinfo)
* class [Scene](/3d/python-net/aspose.threed/scene)
