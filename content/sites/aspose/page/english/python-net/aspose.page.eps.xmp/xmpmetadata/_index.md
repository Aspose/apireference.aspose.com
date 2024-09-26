---
title: XmpMetadata class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 20
url: /python-net/aspose.page.eps.xmp/xmpmetadata/
---

## XmpMetadata class

Provides access to XMP metadata stream.



The XmpMetadata type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `is_fixed_size` | Checks if colleciton has fixed size. |
| `is_read_only` | Checks if collection is read-only. |
| `keys` | Gets collection of metadata keys. |
| `values` | Gets values in the metadata. |
| `count` | Gets count of elements in the collection. |
| `is_synchronized` | Checks if collection is synchronized. |
| `sync_root` | Gets collection synchronization object. |
## Methods
| Name | Description |
| :- | :- |
| `register_namespace_uri(prefix, namespace_uri)` | Registers namespace URI. |
| `register_namespace_uri(prefix, namespace_uri, schema_description)` | Registers namespace URI. |
| `add(key, value)` | Adds value to metadata. |
| `add(key, value)` | Adds value to metadata. |
| `add_array_item(array_key, value)` | Adds value into an array. The value will be added at the end of the array. |
| `add_array_item(array_key, index, value)` | Adds value into an array by specified index. |
| `get_namespace_uri_by_prefix(prefix)` | Returns  namespace URI by prefix. |
| `get_prefix_by_namespace_uri(namespace_uri)` | Returns prefix by namespace URI. |
| `clear()` | Clears metadata. |
| `contains(key)` | Checks does key is contained in metadata. |
| `remove(key)` | Removes entry from metadata. |
| `get_value(key)` | Gets data from metadata. |
| `set_value(key, value)` | Sets data to metadata. |
| `contains_key(key)` | Determines does this dictionary contasins specified key. |
| `try_get_value(key, value)` | Tries to find key in the dictionary and retreives value if found. |
| `set_array_item(array_key, index, value)` | Sets value in an array. Previous value will be replaced with new one. |
| `add_named_value(structure_key, value_key, value)` | Adds named value into a structure. |
| `set_named_value(structure_key, value_key, value)` | Sets named value into a structure. Previous named value, if already exists, will be replaced with new one. |

### See Also

* module [`aspose.page.eps.xmp`](/page/python-net/aspose.page.eps.xmp/)
* package [`aspose.page`](/page/python-net/)

