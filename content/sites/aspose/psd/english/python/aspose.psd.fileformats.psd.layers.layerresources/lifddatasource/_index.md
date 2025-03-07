---
title: LiFdDataSource Class
type: docs
weight: 510
url: /python-net/aspose.psd.fileformats.psd.layers.layerresources/lifddatasource/
---

**Summary:** Defines the liFD data source class in PSD File that contains information about an embedded file.<br/>            This is part of PSD File Format Manipulation API that helps to modify Adobe® Photoshop® files

**Module:** [aspose.psd.fileformats.psd.layers.layerresources](/psd/python-net/aspose.psd.fileformats.psd.layers.layerresources/)

**Full Name:** aspose.psd.fileformats.psd.layers.layerresources.LiFdDataSource

**Inheritance:** LinkDataSource

**Aspose.PSD Version:** 24.12.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [LiFdDataSource()](#LiFdDataSource__1) | Initializes a new instance of the [LiFdDataSource](/psd/python-net/aspose.psd.fileformats.psd.layers.layerresources/lifddatasource/) class. |
| [LiFdDataSource(version, unique_id, original_file_name, file_type, file_creator)](#LiFdDataSource_version_unique_id_original_file_name_file_type_file_creator_2) | Initializes a new instance of the [LiFdDataSource](/psd/python-net/aspose.psd.fileformats.psd.layers.layerresources/lifddatasource/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| asset_locked_state | bool | r/w | Gets or sets a value indicating whether the PSD asset is locked.<br/>            The asset locked state, for Adobe® Photoshop® СС Libraries assets. |
| asset_mod_time | double | r/w | Gets or sets the asset modified time, for Adobe® Photoshop® СС Libraries assets. |
| child_doc_id | string | r/w | Gets or sets the child document identifier in the liFE or liFD data source of the Lnk2 / LnkE Adobe® Photoshop® resource. |
| comp_id | int | r/w | Gets or sets the ID of the currently selected comp for the child document, which will be -1 if none are selected.<br/>            Comps are compositions of a page layout which designers can create. Using layer comps, you can create, manage, and view multiple versions<br/>            of a layout in a single Adobe® Photoshop® file. A layer comp is a snapshot of a state of the Layers panel. Layer comps save three types of layer options but<br/>            this property gets the Layer Comp selection identifier for Smart Objects.<br/>            <see href="https://helpx.adobe.com/photoshop/using/layer-comps.html">Layer comps in Smart Objects</see> |
| data | byte | r/w | Gets or sets the embedded smart object data in PSD file. |
| file_creator | string | r/w | Gets or sets the file creator in the PSD format LnkE / Lnk2 resource. |
| file_type | string | r/w | Gets or sets the type of the embedded or external file which Adobe® Photoshop® Lnk2 / LnkE resource contains or links. |
| has_file_open_descriptor | bool | r/w | Gets or sets a value indicating whether this link data source has the file open descriptor: CompId and OriginalCompId. |
| is_library_link | bool | r | Gets a value indicating whether this PSD link data source links to the Adobe® Photoshop® СС Library item. |
| length | long | r | Gets the link data source length in bytes. |
| original_comp_id | int | r | Gets the original ID of the currently selected Comp for the child document, which will be -1 if none are selected.<br/>            This property gets the original layer Comp selection identifier for Smart Objects.<br/>            <see href="https://helpx.adobe.com/photoshop/using/layer-comps.html">Layer comps in Smart Objects</see> |
| original_file_name | string | r | Gets the original file name of the data source in the Adobe® Photoshop® global link resource. |
| type | [LinkDataSourceType](/psd/python-net/aspose.psd.fileformats.psd.layers.layerresources/linkdatasourcetype) | r | Gets the Adobe® Photoshop® global link data source type that can be one of the following or none:<br/>            The embedded linked file liFD that corresponds to the PSD Lnk2Resource<br/>            The external linked file liFE that corresponds to the PSD LnkeResource<br/>            The linked file alias liFA |
| unique_id | Guid | r | Gets the global unique identifier of the data source in the PSD link resource. |
| version | int | r | Gets the version of the data source in the PSD LnkE / Lnk2 resource. |


### Constructor: LiFdDataSource() {#LiFdDataSource__1}


```
 LiFdDataSource() 
```

Initializes a new instance of the [LiFdDataSource](/psd/python-net/aspose.psd.fileformats.psd.layers.layerresources/lifddatasource/) class.

### Constructor: LiFdDataSource(version, unique_id, original_file_name, file_type, file_creator) {#LiFdDataSource_version_unique_id_original_file_name_file_type_file_creator_2}


```
 LiFdDataSource(version, unique_id, original_file_name, file_type, file_creator) 
```

Initializes a new instance of the [LiFdDataSource](/psd/python-net/aspose.psd.fileformats.psd.layers.layerresources/lifddatasource/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| version | int | The version. |
| unique_id | Guid | The unique identifier. |
| original_file_name | string | Name of the original file. |
| file_type | string | Type of the file. |
| file_creator | string | The file creator. |

