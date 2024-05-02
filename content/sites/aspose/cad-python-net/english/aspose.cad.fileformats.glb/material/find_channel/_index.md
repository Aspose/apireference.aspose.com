---
title: find_channel method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.cad.fileformats.glb/material/find_channel/
is_root: false
---

## find_channel {#str}

Finds an instance of [`MaterialChannel`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel)


### Returns 


A [`MaterialChannel`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel) structure. or null if it does not exist


```python
def find_channel(self, channel_key):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| channel_key | str | The channel key. Currently, these values are used:<br/>- "Normal"<br/>- "Occlusion"<br/>- "Emissive"<br/>- When material is MaterialPBRMetallicRoughness:<br/>- "BaseColor"<br/>- "MetallicRoughness"<br/>- When material is MaterialPBRSpecularGlossiness:<br/>- "Diffuse"<br/>- "SpecularGlossiness" |



### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`Material`](/cad/python-net/aspose.cad.fileformats.glb/material)
* class [`MaterialChannel`](/cad/python-net/aspose.cad.fileformats.glb/materialchannel)
