package com.thinkconstructive.rest_demo.service.impl;

import com.thinkconstructive.rest_demo.exception.CloudVendorNotFoundException;
import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorSerciveImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorSerciveImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Bussiness Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success Create Cloud Vendor";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Bussiness Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success Updated Cloud Vendor";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // More Bussiness Logic
        /*if (cloudVendorRepository.findById(cloudVendorId).isEmpty()) {
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
        }
        cloudVendorRepository.deleteById(cloudVendorId);*/
        return "Success Deleted Cloud Vendor";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        // More Bussiness Logic
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getByVendorName(String cloudVendorName) {
        // More Bussiness Logic
        return cloudVendorRepository.findByVendorName(cloudVendorName);
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More Bussiness Logic
        return cloudVendorRepository.findAll();
    }
}
