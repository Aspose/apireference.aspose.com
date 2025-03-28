﻿---
title: License.set_license method
linktitle: set_license method
articleTitle: set_license method
second_title: Aspose.Words for Python
description: "aspose.words.License.set_license method"
type: docs
weight: 20
url: /python-net/aspose.words/license/set_license/
---

## set_license(license_name) {#str}

Licenses the component.


```python
def set_license(self, license_name: str):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| license_name | str | Can be a full or short file name or name of an embedded resource. Use an empty string to switch to evaluation mode. |

### Remarks

Tries to find the license in the following locations:

1. Explicit path.

2. The folder that contains the Aspose component assembly.

3. The folder that contains the client's calling assembly.

4. The folder that contains the entry (startup) assembly.

5. An embedded resource in the client's calling assembly.

**Note:** On the .NET Compact Framework, tries to find the license only in these locations:

1. Explicit path.

2. An embedded resource in the client's calling assembly.




## set_license(stream) {#bytesio}

Licenses the component.


```python
def set_license(self, stream: io.BytesIO):
    ...
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | io.BytesIO | A stream that contains the license. |

### Remarks

Use this method to load a license from a stream.




## Examples

Shows how initialize a license for Aspose.Words using a license file in the local file system.

```python
# Set the license for our Aspose.Words product by passing the local file system filename of a valid license file.
license = aw.License()
license.set_license(LICENSE_PATH)
```

Shows how to initialize a license for Aspose.Words from a stream.

```python
# Set the license for our Aspose.Words product by passing a stream for a valid license file in our local file system.
with system_helper.io.File.open_read(LICENSE_PATH) as my_stream:
    license = aw.License()
    license.set_license(stream=my_stream)
```

## See Also

* module [aspose.words](../../)
* class [License](../)

