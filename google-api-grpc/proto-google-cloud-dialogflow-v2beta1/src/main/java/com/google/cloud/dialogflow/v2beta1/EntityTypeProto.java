// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public final class EntityTypeProto {
  private EntityTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/dialogflow/v2beta1/entity" +
      "_type.proto\022\037google.cloud.dialogflow.v2b" +
      "eta1\032\034google/api/annotations.proto\032#goog" +
      "le/longrunning/operations.proto\032\033google/" +
      "protobuf/empty.proto\032 google/protobuf/fi" +
      "eld_mask.proto\032\034google/protobuf/struct.p" +
      "roto\"\323\003\n\nEntityType\022\014\n\004name\030\001 \001(\t\022\024\n\014dis" +
      "play_name\030\002 \001(\t\022>\n\004kind\030\003 \001(\01620.google.c" +
      "loud.dialogflow.v2beta1.EntityType.Kind\022" +
      "Z\n\023auto_expansion_mode\030\004 \001(\0162=.google.cl" +
      "oud.dialogflow.v2beta1.EntityType.AutoEx" +
      "pansionMode\022D\n\010entities\030\006 \003(\01322.google.c" +
      "loud.dialogflow.v2beta1.EntityType.Entit" +
      "y\032)\n\006Entity\022\r\n\005value\030\001 \001(\t\022\020\n\010synonyms\030\002" +
      " \003(\t\"9\n\004Kind\022\024\n\020KIND_UNSPECIFIED\020\000\022\014\n\010KI" +
      "ND_MAP\020\001\022\r\n\tKIND_LIST\020\002\"Y\n\021AutoExpansion" +
      "Mode\022#\n\037AUTO_EXPANSION_MODE_UNSPECIFIED\020" +
      "\000\022\037\n\033AUTO_EXPANSION_MODE_DEFAULT\020\001\"f\n\026Li" +
      "stEntityTypesRequest\022\016\n\006parent\030\001 \001(\t\022\025\n\r" +
      "language_code\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022" +
      "\n\npage_token\030\004 \001(\t\"u\n\027ListEntityTypesRes" +
      "ponse\022A\n\014entity_types\030\001 \003(\0132+.google.clo" +
      "ud.dialogflow.v2beta1.EntityType\022\027\n\017next" +
      "_page_token\030\002 \001(\t\";\n\024GetEntityTypeReques" +
      "t\022\014\n\004name\030\001 \001(\t\022\025\n\rlanguage_code\030\002 \001(\t\"\202" +
      "\001\n\027CreateEntityTypeRequest\022\016\n\006parent\030\001 \001" +
      "(\t\022@\n\013entity_type\030\002 \001(\0132+.google.cloud.d" +
      "ialogflow.v2beta1.EntityType\022\025\n\rlanguage" +
      "_code\030\003 \001(\t\"\243\001\n\027UpdateEntityTypeRequest\022" +
      "@\n\013entity_type\030\001 \001(\0132+.google.cloud.dial" +
      "ogflow.v2beta1.EntityType\022\025\n\rlanguage_co" +
      "de\030\002 \001(\t\022/\n\013update_mask\030\003 \001(\0132\032.google.p" +
      "rotobuf.FieldMask\"\'\n\027DeleteEntityTypeReq" +
      "uest\022\014\n\004name\030\001 \001(\t\"\203\002\n\035BatchUpdateEntity" +
      "TypesRequest\022\016\n\006parent\030\001 \001(\t\022\037\n\025entity_t" +
      "ype_batch_uri\030\002 \001(\tH\000\022T\n\030entity_type_bat" +
      "ch_inline\030\003 \001(\01320.google.cloud.dialogflo" +
      "w.v2beta1.EntityTypeBatchH\000\022\025\n\rlanguage_" +
      "code\030\004 \001(\t\022/\n\013update_mask\030\005 \001(\0132\032.google" +
      ".protobuf.FieldMaskB\023\n\021entity_type_batch" +
      "\"c\n\036BatchUpdateEntityTypesResponse\022A\n\014en" +
      "tity_types\030\001 \003(\0132+.google.cloud.dialogfl" +
      "ow.v2beta1.EntityType\"J\n\035BatchDeleteEnti" +
      "tyTypesRequest\022\016\n\006parent\030\001 \001(\t\022\031\n\021entity" +
      "_type_names\030\002 \003(\t\"\211\001\n\032BatchCreateEntitie" +
      "sRequest\022\016\n\006parent\030\001 \001(\t\022D\n\010entities\030\002 \003" +
      "(\01322.google.cloud.dialogflow.v2beta1.Ent" +
      "ityType.Entity\022\025\n\rlanguage_code\030\003 \001(\t\"\272\001" +
      "\n\032BatchUpdateEntitiesRequest\022\016\n\006parent\030\001" +
      " \001(\t\022D\n\010entities\030\002 \003(\01322.google.cloud.di" +
      "alogflow.v2beta1.EntityType.Entity\022\025\n\rla" +
      "nguage_code\030\003 \001(\t\022/\n\013update_mask\030\004 \001(\0132\032" +
      ".google.protobuf.FieldMask\"Z\n\032BatchDelet" +
      "eEntitiesRequest\022\016\n\006parent\030\001 \001(\t\022\025\n\renti" +
      "ty_values\030\002 \003(\t\022\025\n\rlanguage_code\030\003 \001(\t\"T" +
      "\n\017EntityTypeBatch\022A\n\014entity_types\030\001 \003(\0132" +
      "+.google.cloud.dialogflow.v2beta1.Entity" +
      "Type2\373\016\n\013EntityTypes\022\274\001\n\017ListEntityTypes" +
      "\0227.google.cloud.dialogflow.v2beta1.ListE" +
      "ntityTypesRequest\0328.google.cloud.dialogf" +
      "low.v2beta1.ListEntityTypesResponse\"6\202\323\344" +
      "\223\0020\022./v2beta1/{parent=projects/*/agent}/" +
      "entityTypes\022\253\001\n\rGetEntityType\0225.google.c" +
      "loud.dialogflow.v2beta1.GetEntityTypeReq" +
      "uest\032+.google.cloud.dialogflow.v2beta1.E" +
      "ntityType\"6\202\323\344\223\0020\022./v2beta1/{name=projec" +
      "ts/*/agent/entityTypes/*}\022\276\001\n\020CreateEnti" +
      "tyType\0228.google.cloud.dialogflow.v2beta1" +
      ".CreateEntityTypeRequest\032+.google.cloud." +
      "dialogflow.v2beta1.EntityType\"C\202\323\344\223\002=\"./" +
      "v2beta1/{parent=projects/*/agent}/entity" +
      "Types:\013entity_type\022\312\001\n\020UpdateEntityType\022" +
      "8.google.cloud.dialogflow.v2beta1.Update" +
      "EntityTypeRequest\032+.google.cloud.dialogf" +
      "low.v2beta1.EntityType\"O\202\323\344\223\002I2:/v2beta1" +
      "/{entity_type.name=projects/*/agent/enti" +
      "tyTypes/*}:\013entity_type\022\234\001\n\020DeleteEntity" +
      "Type\0228.google.cloud.dialogflow.v2beta1.D" +
      "eleteEntityTypeRequest\032\026.google.protobuf" +
      ".Empty\"6\202\323\344\223\0020*./v2beta1/{name=projects/" +
      "*/agent/entityTypes/*}\022\276\001\n\026BatchUpdateEn" +
      "tityTypes\022>.google.cloud.dialogflow.v2be" +
      "ta1.BatchUpdateEntityTypesRequest\032\035.goog" +
      "le.longrunning.Operation\"E\202\323\344\223\002?\":/v2bet" +
      "a1/{parent=projects/*/agent}/entityTypes" +
      ":batchUpdate:\001*\022\276\001\n\026BatchDeleteEntityTyp" +
      "es\022>.google.cloud.dialogflow.v2beta1.Bat" +
      "chDeleteEntityTypesRequest\032\035.google.long" +
      "running.Operation\"E\202\323\344\223\002?\":/v2beta1/{par" +
      "ent=projects/*/agent}/entityTypes:batchD" +
      "elete:\001*\022\303\001\n\023BatchCreateEntities\022;.googl" +
      "e.cloud.dialogflow.v2beta1.BatchCreateEn" +
      "titiesRequest\032\035.google.longrunning.Opera" +
      "tion\"P\202\323\344\223\002J\"E/v2beta1/{parent=projects/" +
      "*/agent/entityTypes/*}/entities:batchCre" +
      "ate:\001*\022\303\001\n\023BatchUpdateEntities\022;.google." +
      "cloud.dialogflow.v2beta1.BatchUpdateEnti" +
      "tiesRequest\032\035.google.longrunning.Operati" +
      "on\"P\202\323\344\223\002J\"E/v2beta1/{parent=projects/*/" +
      "agent/entityTypes/*}/entities:batchUpdat" +
      "e:\001*\022\303\001\n\023BatchDeleteEntities\022;.google.cl" +
      "oud.dialogflow.v2beta1.BatchDeleteEntiti" +
      "esRequest\032\035.google.longrunning.Operation" +
      "\"P\202\323\344\223\002J\"E/v2beta1/{parent=projects/*/ag" +
      "ent/entityTypes/*}/entities:batchDelete:" +
      "\001*B\255\001\n#com.google.cloud.dialogflow.v2bet" +
      "a1B\017EntityTypeProtoP\001ZIgoogle.golang.org" +
      "/genproto/googleapis/cloud/dialogflow/v2" +
      "beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud." +
      "Dialogflow.V2beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Kind", "AutoExpansionMode", "Entities", });
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor =
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor,
        new java.lang.String[] { "Value", "Synonyms", });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor,
        new java.lang.String[] { "Parent", "LanguageCode", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor,
        new java.lang.String[] { "EntityTypes", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor,
        new java.lang.String[] { "Parent", "EntityType", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor,
        new java.lang.String[] { "EntityType", "LanguageCode", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor,
        new java.lang.String[] { "Parent", "EntityTypeBatchUri", "EntityTypeBatchInline", "LanguageCode", "UpdateMask", "EntityTypeBatch", });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor,
        new java.lang.String[] { "EntityTypes", });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor,
        new java.lang.String[] { "Parent", "EntityTypeNames", });
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor,
        new java.lang.String[] { "Parent", "Entities", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor,
        new java.lang.String[] { "Parent", "Entities", "LanguageCode", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor,
        new java.lang.String[] { "Parent", "EntityValues", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor,
        new java.lang.String[] { "EntityTypes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}