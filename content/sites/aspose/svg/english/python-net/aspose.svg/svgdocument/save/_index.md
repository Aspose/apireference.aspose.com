---
title: save method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 450
url: /python-net/aspose.svg/svgdocument/save/
is_root: false
---

## save {#aspose.svg.Url}

Saves the document to local file specified by `url`. All resources used in this document will be saved in 
to adjacent folder, whose name will be constructed as: output_file_name + "_files".
If the specified `url` ends with ".svgz", the document will be saved as a compressed SVGZ file.



```python
def save(self, url):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| url | [`Url`](/svg/python-net/aspose.svg/url) | Local URL to output file. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Raised if the specified `url` is not a valid local file URL. |




## save {#str}

Saves the document to local file specified by `path`. All resources used in this document will be saved in 
to adjacent folder, whose name will be constructed as: output_file_name + "_files".



```python
def save(self, path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| path | str | Local path to output file. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Raised if the specified `path` is not a valid local file path. |




## save {#aspose.svg.saving.resourcehandlers.ResourceHandler}

Saves the document content and resources using the [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler).



```python
def save(self, resource_handler):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| resource_handler | aspose.svg.saving.resourcehandlers.ResourceHandler | The resource handler [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler). |


## save {#str-aspose.svg.saving.SVGSaveFormat}

Saves the document to local file specified by `path`. All resources used in this document will be saved in 
to adjacent folder, whose name will be constructed as: output_file_name + "_files".



```python
def save(self, path, save_format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| path | str | Local path to output file. |
| save_format | aspose.svg.saving.SVGSaveFormat | Format in which document is saved. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Raised if the specified `path` is not a valid local file path. |
| ArgumentOutOfRangeException | Thrown when the specified `save_format` value is not recognised by the current implementation. |




## save {#aspose.svg.saving.resourcehandlers.ResourceHandler-aspose.svg.saving.SVGSaveFormat}

Saves the document content and resources using the [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler).



```python
def save(self, resource_handler, save_format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| resource_handler | aspose.svg.saving.resourcehandlers.ResourceHandler | The resource handler [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler). |
| save_format | aspose.svg.saving.SVGSaveFormat | Format in which document is saved. |


## save {#str-aspose.svg.saving.SVGSaveOptions}

Saves the document as an `.svg` file to the local path specified by
`path`.  
Any external resources are written to a sibling folder named
`{output_file_name}_files`.



```python
def save(self, path, save_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| path | str | Absolute or relative path of the target `.svg` file. |
| save_options | aspose.svg.saving.SVGSaveOptions | Options that control plain-SVG serialization. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Thrown if `path` is not a valid local file path. |




## save {#str-aspose.svg.saving.SVGZSaveOptions}

Saves the document as a compressed `.svgz` file to the local path specified by
`path`.  
Any external resources are written to a sibling folder named
`{output_file_name}_files`.



```python
def save(self, path, save_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| path | str | Absolute or relative path of the target `.svgz` file. |
| save_options | aspose.svg.saving.SVGZSaveOptions | Options that control SVGZ serialization. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Thrown if `path` is not a valid local file path. |




## save {#aspose.svg.saving.resourcehandlers.ResourceHandler-aspose.svg.saving.SVGSaveOptions}

Saves the document content and resources using the [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler).



```python
def save(self, resource_handler, save_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| resource_handler | aspose.svg.saving.resourcehandlers.ResourceHandler | The resource handler [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler). |
| save_options | aspose.svg.saving.SVGSaveOptions | SVG save options. |


## save {#aspose.svg.Url-aspose.svg.saving.SVGSaveFormat}

Saves the document to local file specified by `url`. All resources used in this document will be saved in 
to adjacent folder, whose name will be constructed as: output_file_name + "_files".



```python
def save(self, url, save_format):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| url | [`Url`](/svg/python-net/aspose.svg/url) | Local URL to output file. |
| save_format | aspose.svg.saving.SVGSaveFormat | Format in which document is saved. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Thrown when `url` does not represent a valid local file location (e.g., it is null, relative, or points to a non-file scheme). |
| ArgumentOutOfRangeException | Thrown when the supplied `save_format` value is not recognised by the current implementation. |




## save {#aspose.svg.Url-aspose.svg.saving.SVGSaveOptions}

Saves the document as an `.svg` file to `url`.
All external resources are placed in a sibling folder named
`{output_file_name}_files`.



```python
def save(self, url, save_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| url | [`Url`](/svg/python-net/aspose.svg/url) | Local path of the target `.svg` file. |
| save_options | aspose.svg.saving.SVGSaveOptions | Options that control plain-SVG serialization. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Thrown if `url` is not a valid local file path. |




## save {#aspose.svg.Url-aspose.svg.saving.SVGZSaveOptions}

Saves the document as a compressed `.svgz` file to `url`.
All external resources are placed in a sibling folder named
`{output_file_name}_files`.



```python
def save(self, url, save_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| url | [`Url`](/svg/python-net/aspose.svg/url) | Local path of the target `.svgz` file. |
| save_options | aspose.svg.saving.SVGZSaveOptions | Options that control SVGZ serialization. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Thrown if `url` is not a valid local file path. |




## save {#aspose.svg.saving.resourcehandlers.ResourceHandler-aspose.svg.saving.SVGSaveFormat-aspose.svg.saving.SVGSaveOptions}

Saves the document content and associated resources using the specified [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler).



```python
def save(self, resource_handler, save_format, save_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| resource_handler | aspose.svg.saving.resourcehandlers.ResourceHandler | The resource handler to manage document resources, such as file system or memory-based storage. |
| save_format | aspose.svg.saving.SVGSaveFormat | The format in which the document should be saved. |
| save_options | aspose.svg.saving.SVGSaveOptions | Options that specify additional saving parameters, such as vectorization preferences. |



### See Also
* module [`aspose.svg`](../../)
* class [`ResourceHandler`](/svg/python-net/aspose.svg.saving.resourcehandlers/resourcehandler)
* class [`SVGDocument`](/svg/python-net/aspose.svg/svgdocument)
