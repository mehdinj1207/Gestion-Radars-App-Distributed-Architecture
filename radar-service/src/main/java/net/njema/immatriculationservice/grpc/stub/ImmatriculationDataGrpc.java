package net.njema.immatriculationservice.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ImmatriculationData.proto")
public final class ImmatriculationDataGrpc {

  private ImmatriculationDataGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationData";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse> getGetAllProprietairesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProprietaires",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse> getGetAllProprietairesMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse> getGetAllProprietairesMethod;
    if ((getGetAllProprietairesMethod = ImmatriculationDataGrpc.getGetAllProprietairesMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getGetAllProprietairesMethod = ImmatriculationDataGrpc.getGetAllProprietairesMethod) == null) {
          ImmatriculationDataGrpc.getGetAllProprietairesMethod = getGetAllProprietairesMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "getAllProprietaires"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("getAllProprietaires"))
                  .build();
          }
        }
     }
     return getGetAllProprietairesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse> getGetProprietaireByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaireById",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse> getGetProprietaireByIdMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse> getGetProprietaireByIdMethod;
    if ((getGetProprietaireByIdMethod = ImmatriculationDataGrpc.getGetProprietaireByIdMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getGetProprietaireByIdMethod = ImmatriculationDataGrpc.getGetProprietaireByIdMethod) == null) {
          ImmatriculationDataGrpc.getGetProprietaireByIdMethod = getGetProprietaireByIdMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "getProprietaireById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("getProprietaireById"))
                  .build();
          }
        }
     }
     return getGetProprietaireByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse> getGetProprietaireByVehiculeIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaireByVehiculeId",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse> getGetProprietaireByVehiculeIdMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse> getGetProprietaireByVehiculeIdMethod;
    if ((getGetProprietaireByVehiculeIdMethod = ImmatriculationDataGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getGetProprietaireByVehiculeIdMethod = ImmatriculationDataGrpc.getGetProprietaireByVehiculeIdMethod) == null) {
          ImmatriculationDataGrpc.getGetProprietaireByVehiculeIdMethod = getGetProprietaireByVehiculeIdMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "getProprietaireByVehiculeId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("getProprietaireByVehiculeId"))
                  .build();
          }
        }
     }
     return getGetProprietaireByVehiculeIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse> getSaveProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProprietaire",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse> getSaveProprietaireMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse> getSaveProprietaireMethod;
    if ((getSaveProprietaireMethod = ImmatriculationDataGrpc.getSaveProprietaireMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getSaveProprietaireMethod = ImmatriculationDataGrpc.getSaveProprietaireMethod) == null) {
          ImmatriculationDataGrpc.getSaveProprietaireMethod = getSaveProprietaireMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "saveProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("saveProprietaire"))
                  .build();
          }
        }
     }
     return getSaveProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse> getUpdateProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProprietaire",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse> getUpdateProprietaireMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse> getUpdateProprietaireMethod;
    if ((getUpdateProprietaireMethod = ImmatriculationDataGrpc.getUpdateProprietaireMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getUpdateProprietaireMethod = ImmatriculationDataGrpc.getUpdateProprietaireMethod) == null) {
          ImmatriculationDataGrpc.getUpdateProprietaireMethod = getUpdateProprietaireMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "updateProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("updateProprietaire"))
                  .build();
          }
        }
     }
     return getUpdateProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse> getDeleteProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProprietaire",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse> getDeleteProprietaireMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse> getDeleteProprietaireMethod;
    if ((getDeleteProprietaireMethod = ImmatriculationDataGrpc.getDeleteProprietaireMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getDeleteProprietaireMethod = ImmatriculationDataGrpc.getDeleteProprietaireMethod) == null) {
          ImmatriculationDataGrpc.getDeleteProprietaireMethod = getDeleteProprietaireMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "DeleteProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("DeleteProprietaire"))
                  .build();
          }
        }
     }
     return getDeleteProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse> getGetAllVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllVehicules",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse> getGetAllVehiculesMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse> getGetAllVehiculesMethod;
    if ((getGetAllVehiculesMethod = ImmatriculationDataGrpc.getGetAllVehiculesMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getGetAllVehiculesMethod = ImmatriculationDataGrpc.getGetAllVehiculesMethod) == null) {
          ImmatriculationDataGrpc.getGetAllVehiculesMethod = getGetAllVehiculesMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "getAllVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("getAllVehicules"))
                  .build();
          }
        }
     }
     return getGetAllVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse> getGetVehiculeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeById",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse> getGetVehiculeByIdMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse> getGetVehiculeByIdMethod;
    if ((getGetVehiculeByIdMethod = ImmatriculationDataGrpc.getGetVehiculeByIdMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getGetVehiculeByIdMethod = ImmatriculationDataGrpc.getGetVehiculeByIdMethod) == null) {
          ImmatriculationDataGrpc.getGetVehiculeByIdMethod = getGetVehiculeByIdMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "getVehiculeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("getVehiculeById"))
                  .build();
          }
        }
     }
     return getGetVehiculeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse> getSaveVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicule",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse> getSaveVehiculeMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse> getSaveVehiculeMethod;
    if ((getSaveVehiculeMethod = ImmatriculationDataGrpc.getSaveVehiculeMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getSaveVehiculeMethod = ImmatriculationDataGrpc.getSaveVehiculeMethod) == null) {
          ImmatriculationDataGrpc.getSaveVehiculeMethod = getSaveVehiculeMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "saveVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("saveVehicule"))
                  .build();
          }
        }
     }
     return getSaveVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse> getUpdateVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateVehicule",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse> getUpdateVehiculeMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse> getUpdateVehiculeMethod;
    if ((getUpdateVehiculeMethod = ImmatriculationDataGrpc.getUpdateVehiculeMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getUpdateVehiculeMethod = ImmatriculationDataGrpc.getUpdateVehiculeMethod) == null) {
          ImmatriculationDataGrpc.getUpdateVehiculeMethod = getUpdateVehiculeMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "updateVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("updateVehicule"))
                  .build();
          }
        }
     }
     return getUpdateVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse> getDeleteVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVehicule",
      requestType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest.class,
      responseType = net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest,
      net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse> getDeleteVehiculeMethod() {
    io.grpc.MethodDescriptor<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse> getDeleteVehiculeMethod;
    if ((getDeleteVehiculeMethod = ImmatriculationDataGrpc.getDeleteVehiculeMethod) == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        if ((getDeleteVehiculeMethod = ImmatriculationDataGrpc.getDeleteVehiculeMethod) == null) {
          ImmatriculationDataGrpc.getDeleteVehiculeMethod = getDeleteVehiculeMethod = 
              io.grpc.MethodDescriptor.<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest, net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationData", "DeleteVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationDataMethodDescriptorSupplier("DeleteVehicule"))
                  .build();
          }
        }
     }
     return getDeleteVehiculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationDataStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationDataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationDataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationDataFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationDataImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllProprietaires(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllProprietairesMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaireById(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByIdMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaireByVehiculeId(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByVehiculeIdMethod(), responseObserver);
    }

    /**
     */
    public void saveProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void updateProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void deleteProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void getAllVehicules(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void getVehiculeById(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void updateVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void deleteVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVehiculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllProprietairesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse>(
                  this, METHODID_GET_ALL_PROPRIETAIRES)))
          .addMethod(
            getGetProprietaireByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse>(
                  this, METHODID_GET_PROPRIETAIRE_BY_ID)))
          .addMethod(
            getGetProprietaireByVehiculeIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse>(
                  this, METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID)))
          .addMethod(
            getSaveProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse>(
                  this, METHODID_SAVE_PROPRIETAIRE)))
          .addMethod(
            getUpdateProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse>(
                  this, METHODID_UPDATE_PROPRIETAIRE)))
          .addMethod(
            getDeleteProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse>(
                  this, METHODID_DELETE_PROPRIETAIRE)))
          .addMethod(
            getGetAllVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse>(
                  this, METHODID_GET_ALL_VEHICULES)))
          .addMethod(
            getGetVehiculeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse>(
                  this, METHODID_GET_VEHICULE_BY_ID)))
          .addMethod(
            getSaveVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse>(
                  this, METHODID_SAVE_VEHICULE)))
          .addMethod(
            getUpdateVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse>(
                  this, METHODID_UPDATE_VEHICULE)))
          .addMethod(
            getDeleteVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest,
                net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse>(
                  this, METHODID_DELETE_VEHICULE)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationDataStub extends io.grpc.stub.AbstractStub<ImmatriculationDataStub> {
    private ImmatriculationDataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationDataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationDataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationDataStub(channel, callOptions);
    }

    /**
     */
    public void getAllProprietaires(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllProprietairesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaireById(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaireByVehiculeId(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByVehiculeIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllVehicules(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehiculeById(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest request,
        io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVehiculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationDataBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationDataBlockingStub> {
    private ImmatriculationDataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationDataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationDataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationDataBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse getAllProprietaires(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllProprietairesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse getProprietaireById(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse getProprietaireByVehiculeId(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByVehiculeIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse saveProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse updateProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse deleteProprietaire(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse getAllVehicules(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse getVehiculeById(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse saveVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse updateVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse deleteVehicule(net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVehiculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationDataFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationDataFutureStub> {
    private ImmatriculationDataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationDataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationDataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationDataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse> getAllProprietaires(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllProprietairesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse> getProprietaireById(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse> getProprietaireByVehiculeId(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByVehiculeIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse> saveProprietaire(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse> updateProprietaire(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse> deleteProprietaire(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse> getAllVehicules(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllVehiculesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse> getVehiculeById(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse> saveVehicule(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse> updateVehicule(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse> deleteVehicule(
        net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PROPRIETAIRES = 0;
  private static final int METHODID_GET_PROPRIETAIRE_BY_ID = 1;
  private static final int METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID = 2;
  private static final int METHODID_SAVE_PROPRIETAIRE = 3;
  private static final int METHODID_UPDATE_PROPRIETAIRE = 4;
  private static final int METHODID_DELETE_PROPRIETAIRE = 5;
  private static final int METHODID_GET_ALL_VEHICULES = 6;
  private static final int METHODID_GET_VEHICULE_BY_ID = 7;
  private static final int METHODID_SAVE_VEHICULE = 8;
  private static final int METHODID_UPDATE_VEHICULE = 9;
  private static final int METHODID_DELETE_VEHICULE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationDataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PROPRIETAIRES:
          serviceImpl.getAllProprietaires((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllProprietairesResponse>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE_BY_ID:
          serviceImpl.getProprietaireById((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByIdResponse>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE_BY_VEHICULE_ID:
          serviceImpl.getProprietaireByVehiculeId((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse>) responseObserver);
          break;
        case METHODID_SAVE_PROPRIETAIRE:
          serviceImpl.saveProprietaire((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveProprietaireResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROPRIETAIRE:
          serviceImpl.updateProprietaire((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateProprietaireResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROPRIETAIRE:
          serviceImpl.deleteProprietaire((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteProprietaireResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_VEHICULES:
          serviceImpl.getAllVehicules((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetAllVehiculesResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICULE_BY_ID:
          serviceImpl.getVehiculeById((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.GetVehiculeByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_VEHICULE:
          serviceImpl.saveVehicule((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.SaveVehiculeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VEHICULE:
          serviceImpl.updateVehicule((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.UpdateVehiculeResponse>) responseObserver);
          break;
        case METHODID_DELETE_VEHICULE:
          serviceImpl.deleteVehicule((net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.DeleteVehiculeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImmatriculationDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationData");
    }
  }

  private static final class ImmatriculationDataFileDescriptorSupplier
      extends ImmatriculationDataBaseDescriptorSupplier {
    ImmatriculationDataFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationDataMethodDescriptorSupplier
      extends ImmatriculationDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationDataMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImmatriculationDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationDataFileDescriptorSupplier())
              .addMethod(getGetAllProprietairesMethod())
              .addMethod(getGetProprietaireByIdMethod())
              .addMethod(getGetProprietaireByVehiculeIdMethod())
              .addMethod(getSaveProprietaireMethod())
              .addMethod(getUpdateProprietaireMethod())
              .addMethod(getDeleteProprietaireMethod())
              .addMethod(getGetAllVehiculesMethod())
              .addMethod(getGetVehiculeByIdMethod())
              .addMethod(getSaveVehiculeMethod())
              .addMethod(getUpdateVehiculeMethod())
              .addMethod(getDeleteVehiculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
