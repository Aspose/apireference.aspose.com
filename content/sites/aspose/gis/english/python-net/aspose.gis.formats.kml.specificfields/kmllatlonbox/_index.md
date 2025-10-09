---
title: KmlLatLonBox Class
type: docs
weight: 40
url: /python-net/aspose.gis.formats.kml.specificfields/kmllatlonbox/
---

**Summary:** Specifies object from Kml 'LatLonBox' node

**Module:** [aspose.gis.formats.kml.specificfields](/psd/python-net/aspose.gis.formats.kml.specificfields/)

**Full Name:** aspose.gis.formats.kml.specificfields.KmlLatLonBox

**Inheritance:** XmlNodeLink

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| children | [NodeLink[]](/psd/python-net/aspose.gis/nodelink) | r | Gets the children. |
| east | double | r/w | East of 'LatLonBox' node. |
| max_altitude | Nullable<double> | r/w | MaxAltitude of 'LatLonBox' node. |
| min_altitude | Nullable<double> | r/w | MinAltitude of 'LatLonBox' node. |
| name_without_prefix | string | r | Gets the name without prefix. |
| node_name | string | r/w | Gets or sets the name. |
| node_value | string | r/w | Gets or sets the value. |
| north | double | r/w | North of 'LatLonBox' node. |
| prefix | string | r | Gets the prefix. |
| rotation | Nullable<double> | r/w | Rotation of 'LatLonBox' node. |
| south | double | r/w | South of 'LatLonBox' node. |
| west | double | r/w | West of 'LatLonBox' node. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add_child(child)](#add_child_child_1) | Adds the child. |
| [as_bool()](#as_bool__2) | Returns value casted to the bool |
| [as_double()](#as_double__3) | Returns value casted to the double. |
| [as_int()](#as_int__4) | Returns value casted to the int. |
| [find_nodes_by_name(name)](#find_nodes_by_name_name_5) | Finds the XML nodes by the name |
| [get_node_by_name(name)](#get_node_by_name_name_6) | Gets the node by name. Please note, this method will return the first found Node.<br/>            Doesn't matter in what level it will be found |
| [get_node_content()](#get_node_content__7) | Gets the content of the node. |
| [get_nodes_by_name(names)](#get_nodes_by_name_names_8) | Gets the all nodes with the specified name. <br/>            Doesn't matter in what level it will be found |


### Method: add_child(child) {#add_child_child_1}


```
 add_child(child) 
```

Adds the child.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| child | [NodeLink](/psd/python-net/aspose.gis/nodelink) | The child. |

### Method: as_bool() {#as_bool__2}


```
 as_bool() 
```

Returns value casted to the bool

**Returns**

| Type | Description |
| :- | :- |
| bool | The bool value of node |


### Method: as_double() {#as_double__3}


```
 as_double() 
```

Returns value casted to the double.

**Returns**

| Type | Description |
| :- | :- |
| double | The double value of node |


### Method: as_int() {#as_int__4}


```
 as_int() 
```

Returns value casted to the int.

**Returns**

| Type | Description |
| :- | :- |
| int | The int value of node |


### Method: find_nodes_by_name(name) {#find_nodes_by_name_name_5}


```
 find_nodes_by_name(name) 
```

Finds the XML nodes by the name

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | The name of the node |

**Returns**

| Type | Description |
| :- | :- |
| [NodeLink[]](/psd/python-net/aspose.gis/nodelink) | Array of XML Nodes by name |


### Method: get_node_by_name(name) {#get_node_by_name_name_6}


```
 get_node_by_name(name) 
```

Gets the node by name. Please note, this method will return the first found Node.<br/>            Doesn't matter in what level it will be found

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | The name of the node you want to find. |

**Returns**

| Type | Description |
| :- | :- |
| [NodeLink](/psd/python-net/aspose.gis/nodelink) | The found node with NodeLink API |


### Method: get_node_content() {#get_node_content__7}


```
 get_node_content() 
```

Gets the content of the node.

**Returns**

| Type | Description |
| :- | :- |
| string | The content of node |


### Method: get_nodes_by_name(names) {#get_nodes_by_name_names_8}


```
 get_nodes_by_name(names) 
```

Gets the all nodes with the specified name. <br/>            Doesn't matter in what level it will be found

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| names | string | The names. |

**Returns**

| Type | Description |
| :- | :- |
| [NodeLink[]](/psd/python-net/aspose.gis/nodelink) | The array of found nodes. |


